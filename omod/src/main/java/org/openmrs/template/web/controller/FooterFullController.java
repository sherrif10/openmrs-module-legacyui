/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.template.web.controller;

import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FooterFullController {
	
	@RequestMapping("/template/footerFull.htm")
	public String footerFull(Model model) {
		
		String footerExtraData = Context.getRuntimeProperties().getProperty("legacyui.footer.extradata", "");
		
		model.addAttribute("extraData", footerExtraData);
		
		return "module/legacyui/template/footerFull";
	}
	
}

package com.lowagie.json.loaders;

import com.lowagie.text.pdf.AcroFields;

public interface PdfLoader {
	AcroFields load();
	void unload();
}

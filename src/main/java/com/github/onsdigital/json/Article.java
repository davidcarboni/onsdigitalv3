package com.github.onsdigital.json;

import java.util.ArrayList;
import java.util.List;

public class Article extends CollectionItem {

	public String nextRelease = "21 November 2014";
	public Email contact = new Email();

	// Exec summary
	public String lede = "Producer Price Inflation (PPI) measures the price changes of goods bought and sold by UK manufacturers this month compared to the same month a year ago. PPI provides a key measure of inflation alongside other indicators such as the Consumer Prices Index (CPI) and Services Producer Price Index (SPPI)."
			+ "PPI is split into two components: output price inflation and input price inflation. The input price indices capture changes in the cost of the material and fuel inputs that producers face whereas the output price indices capture the changing prices of goods sold by producers."
			+ "This article looks at the trends in both producer price indices since 2000 and which components contribute most towards changes in each price index in recent years.";
	public String more = "Annual output and input price changes follow similar trends, but with the latter tending to have higher price growth1. In Figure 1, trends in producer price inflation can be split into three distinct periods: 2000 to 2005, 2005 to 2012 and 2012 to June 2014.  Both indices experience greater variability within the second period of 2005 to 2012 than compared with the first and third period. From 2005 to 2012 the average growth rate was 2.9% for output price inflation and 8.1% for input price inflation.  The largest peaks and troughs experienced for both indices throughout the time series shown below occurred in the second period of 2005 to 2012. Output price inflation rose to 8.9% in July 2008 while input price inflation rose to 34.8% in June 2008 and both fell to their lowest rates in July 2009: output price inflation falling by 1.6% and input price inflation falling by 14.8%.";

	// Table of contents
	public List<Section> sections = new ArrayList<Section>();

	/**
	 * Sets up some basic content.
	 */
	public Article() {
		type = ContentType.article;
		title = "Cat Tail Inflation, October 2014";
		releaseDate = "19 February 2014";
		Section summary = new Section();
		summary.title = "Summary";
		summary.markdown = "Consectetur adipiscing elit. Suspendisse non tellus nibh. Duis tristique risus sed urna fringilla, eu facilisis orci fringilla. Nullam iaculis libero tempor vehicula ultricies"
				+ "\n\n"
				+ " * The annual rate of output producer price inflation remained low in June, while input prices continued to fall.\n"
				+ " * The output price index for goods produced by UK manufacturers (factory gate prices) rose 0.2% in the year to June, compared with a rise of 0.5% in the year to May.\n"
				+ " * Factory gate prices fell 0.2% between May and June, compared with a fall of 0.1% between April and May\n";
		sections.add(summary);

		Section whatIs = new Section();
		whatIs.title = "What is Producer Price Inflation (PPI)?";

		whatIs.markdown = "Etiam fringilla tellus arcu, quis dapibus lacus lacinia a. Vivamus in sollicitudin eros, sed ornare metus. Nam sapien augue, varius bibendum sagittis sed, malesuada quis augue."
				+ "\n\n"
				+ "> This is an explanation box Morbi orci nulla, lobortis pretium auctor non, varius eget mi. Mauris viverra diam quam, at auctor velit placerat sit amet. In sed erat quis elit eleifend tempus. Pellentesque vestibulum orci nec nulla accumsan egestas. Proin mauris ipsum, ornare posuere risus non, consectetur lobortis mi. Pellentesque mi ante, sodales sollicitudin pretium et, varius vel enim."
				+ "\n\n"
				+ "Etiam ac ultricies orci. Pellentesque et posuere tortor. Nunc quam risus, pharetra non condimentum at, pretium at dolor. Maecenas placerat, arcu non consequat venenatis, eros leo eleifend lorem."
				+ "\n\n"
				+ "    sample chart"
				+ "\n\n"
				+ "Proin sed facilisis sapien. Nunc hendrerit dignissim sapien, vel consequat mi rhoncus eget. Maecenas et tellus convallis, tristique risus vitae.";
		sections.add(whatIs);
	}

}

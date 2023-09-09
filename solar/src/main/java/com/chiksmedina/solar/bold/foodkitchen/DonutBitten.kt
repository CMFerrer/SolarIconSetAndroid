package com.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FoodKitchenGroup

public val FoodKitchenGroup.DonutBitten: ImageVector
    get() {
        if (_donutBitten != null) {
            return _donutBitten!!
        }
        _donutBitten = Builder(name = "DonutBitten", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2803f, 21.5538f)
                curveTo(12.0886f, 20.9089f, 12.303f, 20.102f, 12.9444f, 19.6276f)
                curveTo(13.4368f, 19.2635f, 14.0224f, 19.1452f, 14.5152f, 19.2623f)
                curveTo(14.58f, 19.2776f, 14.6491f, 19.2615f, 14.6961f, 19.2145f)
                curveTo(14.7586f, 19.152f, 14.766f, 19.0532f, 14.7134f, 18.9821f)
                lineTo(14.6196f, 18.8552f)
                curveTo(14.0081f, 18.0283f, 14.3131f, 16.7641f, 15.2994f, 16.0206f)
                curveTo(15.1559f, 15.9229f, 14.9975f, 15.8179f, 14.8289f, 15.7075f)
                lineTo(14.6506f, 15.5911f)
                curveTo(14.4368f, 15.4518f, 14.2126f, 15.3056f, 14.0103f, 15.1665f)
                curveTo(13.4294f, 15.536f, 12.7399f, 15.75f, 12.0005f, 15.75f)
                curveTo(10.9074f, 15.75f, 9.9235f, 15.2823f, 9.2381f, 14.5361f)
                curveTo(8.8311f, 14.7572f, 8.3548f, 14.9796f, 7.8637f, 15.171f)
                curveTo(7.0629f, 15.483f, 6.1286f, 15.75f, 5.3323f, 15.75f)
                curveTo(4.3013f, 15.75f, 3.2379f, 15.3036f, 2.4127f, 14.8509f)
                curveTo(3.6401f, 18.9848f, 7.4682f, 22.0f, 12.0005f, 22.0f)
                curveTo(12.2138f, 22.0f, 12.3411f, 21.7583f, 12.2803f, 21.5538f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7505f, 12.0f)
                curveTo(9.7505f, 10.7574f, 10.7578f, 9.75f, 12.0005f, 9.75f)
                curveTo(13.2431f, 9.75f, 14.2505f, 10.7574f, 14.2505f, 12.0f)
                curveTo(14.2505f, 12.6271f, 13.994f, 13.1942f, 13.5801f, 13.6023f)
                curveTo(13.5287f, 13.6371f, 13.4808f, 13.679f, 13.4378f, 13.7278f)
                lineTo(13.4275f, 13.7396f)
                curveTo(13.0392f, 14.0586f, 12.5422f, 14.25f, 12.0005f, 14.25f)
                curveTo(10.7578f, 14.25f, 9.7505f, 13.2426f, 9.7505f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.4792f, 14.7949f)
                curveTo(20.1866f, 14.2718f, 21.0865f, 14.2561f, 21.627f, 14.7168f)
                curveTo(21.8703f, 13.8529f, 22.0005f, 12.9417f, 22.0005f, 12.0f)
                curveTo(22.0005f, 10.0219f, 21.4261f, 8.1779f, 20.4351f, 6.6257f)
                lineTo(19.5304f, 7.5303f)
                curveTo(19.2375f, 7.8232f, 18.7626f, 7.8232f, 18.4698f, 7.5303f)
                curveTo(18.1769f, 7.2374f, 18.1769f, 6.7626f, 18.4698f, 6.4697f)
                lineTo(19.4698f, 5.4697f)
                curveTo(19.4885f, 5.4509f, 19.508f, 5.4333f, 19.5282f, 5.417f)
                curveTo(17.6952f, 3.3227f, 15.0023f, 2.0f, 12.0005f, 2.0f)
                curveTo(10.0223f, 2.0f, 8.1784f, 2.5744f, 6.6262f, 3.5654f)
                lineTo(7.5304f, 4.4697f)
                curveTo(7.8233f, 4.7626f, 7.8233f, 5.2374f, 7.5304f, 5.5303f)
                curveTo(7.2375f, 5.8232f, 6.7627f, 5.8232f, 6.4697f, 5.5303f)
                lineTo(5.4697f, 4.5303f)
                curveTo(5.4511f, 4.5117f, 5.4337f, 4.4923f, 5.4174f, 4.4723f)
                curveTo(3.3231f, 6.3053f, 2.0005f, 8.9982f, 2.0005f, 12.0f)
                curveTo(2.0005f, 12.2844f, 2.0124f, 12.566f, 2.0356f, 12.8443f)
                curveTo(2.252f, 12.9978f, 2.5196f, 13.177f, 2.8196f, 13.3557f)
                curveTo(3.6383f, 13.8433f, 4.5725f, 14.25f, 5.3323f, 14.25f)
                curveTo(5.8485f, 14.25f, 6.5754f, 14.0632f, 7.3191f, 13.7733f)
                curveTo(7.7395f, 13.6095f, 8.1349f, 13.4248f, 8.4637f, 13.2495f)
                curveTo(8.3256f, 12.8586f, 8.2505f, 12.4381f, 8.2505f, 12.0f)
                curveTo(8.2505f, 9.9289f, 9.9294f, 8.25f, 12.0005f, 8.25f)
                curveTo(14.0716f, 8.25f, 15.7505f, 9.9289f, 15.7505f, 12.0f)
                curveTo(15.7505f, 12.7772f, 15.5141f, 13.4991f, 15.1093f, 14.0978f)
                curveTo(15.2235f, 14.1734f, 15.3483f, 14.255f, 15.4814f, 14.342f)
                lineTo(15.6505f, 14.4525f)
                curveTo(16.1277f, 14.7649f, 16.7133f, 15.1521f, 17.0308f, 15.4696f)
                curveTo(17.0439f, 15.4827f, 17.0564f, 15.4962f, 17.0683f, 15.51f)
                curveTo(17.5434f, 15.5687f, 17.9691f, 15.7906f, 18.25f, 16.1704f)
                lineTo(18.5254f, 16.5427f)
                curveTo(18.5565f, 16.5848f, 18.6177f, 16.5894f, 18.6547f, 16.5524f)
                curveTo(18.6743f, 16.5328f, 18.683f, 16.505f, 18.6793f, 16.4776f)
                curveTo(18.6005f, 15.8921f, 18.8922f, 15.229f, 19.4792f, 14.7949f)
                close()
                moveTo(16.4501f, 4.4f)
                curveTo(16.7815f, 4.6485f, 16.8486f, 5.1186f, 16.6001f, 5.45f)
                lineTo(15.1001f, 7.45f)
                curveTo(14.8516f, 7.7814f, 14.3815f, 7.8485f, 14.0501f, 7.6f)
                curveTo(13.7187f, 7.3515f, 13.6516f, 6.8814f, 13.9001f, 6.55f)
                lineTo(15.4001f, 4.55f)
                curveTo(15.6486f, 4.2186f, 16.1187f, 4.1515f, 16.4501f, 4.4f)
                close()
                moveTo(10.4698f, 3.4697f)
                curveTo(10.1769f, 3.7626f, 10.1769f, 4.2374f, 10.4698f, 4.5303f)
                lineTo(11.4698f, 5.5303f)
                curveTo(11.7626f, 5.8232f, 12.2375f, 5.8232f, 12.5304f, 5.5303f)
                curveTo(12.8233f, 5.2374f, 12.8233f, 4.7626f, 12.5304f, 4.4697f)
                lineTo(11.5304f, 3.4697f)
                curveTo(11.2375f, 3.1768f, 10.7626f, 3.1768f, 10.4698f, 3.4697f)
                close()
                moveTo(8.4096f, 7.5601f)
                curveTo(8.5168f, 7.9602f, 8.9281f, 8.1977f, 9.3282f, 8.0905f)
                lineTo(10.6942f, 7.7244f)
                curveTo(11.0943f, 7.6172f, 11.3317f, 7.206f, 11.2245f, 6.8059f)
                curveTo(11.1173f, 6.4058f, 10.7061f, 6.1684f, 10.306f, 6.2756f)
                lineTo(8.9399f, 6.6416f)
                curveTo(8.5399f, 6.7488f, 8.3024f, 7.16f, 8.4096f, 7.5601f)
                close()
                moveTo(5.8969f, 7.1736f)
                curveTo(5.5199f, 7.345f, 5.3531f, 7.7897f, 5.5245f, 8.1668f)
                lineTo(6.1098f, 9.4542f)
                curveTo(6.2812f, 9.8313f, 6.7258f, 9.998f, 7.1029f, 9.8266f)
                curveTo(7.48f, 9.6552f, 7.6467f, 9.2106f, 7.4753f, 8.8335f)
                lineTo(6.8901f, 7.5461f)
                curveTo(6.7187f, 7.169f, 6.274f, 7.0022f, 5.8969f, 7.1736f)
                close()
                moveTo(16.7514f, 11.1384f)
                curveTo(17.1652f, 11.119f, 17.4848f, 10.7678f, 17.4654f, 10.354f)
                lineTo(17.399f, 8.9414f)
                curveTo(17.3795f, 8.5276f, 17.0284f, 8.208f, 16.6146f, 8.2274f)
                curveTo(16.2009f, 8.2469f, 15.8812f, 8.5981f, 15.9006f, 9.0118f)
                lineTo(15.967f, 10.4245f)
                curveTo(15.9865f, 10.8382f, 16.3377f, 11.1579f, 16.7514f, 11.1384f)
                close()
                moveTo(18.4369f, 12.0586f)
                curveTo(18.7106f, 12.3694f, 19.1846f, 12.3995f, 19.4954f, 12.1257f)
                lineTo(21.1735f, 10.6479f)
                curveTo(21.4843f, 10.3741f, 21.5144f, 9.9002f, 21.2406f, 9.5893f)
                curveTo(20.9669f, 9.2785f, 20.493f, 9.2484f, 20.1821f, 9.5222f)
                lineTo(18.504f, 11.0f)
                curveTo(18.1932f, 11.2738f, 18.1631f, 11.7477f, 18.4369f, 12.0586f)
                close()
                moveTo(6.943f, 10.8948f)
                curveTo(7.2773f, 11.1394f, 7.3499f, 11.6087f, 7.1053f, 11.9429f)
                lineTo(6.2701f, 13.0842f)
                curveTo(6.0254f, 13.4184f, 5.5562f, 13.4911f, 5.2219f, 13.2464f)
                curveTo(4.8877f, 13.0018f, 4.815f, 12.5325f, 5.0596f, 12.1983f)
                lineTo(5.8949f, 11.0571f)
                curveTo(6.1395f, 10.7228f, 6.6088f, 10.6501f, 6.943f, 10.8948f)
                close()
                moveTo(3.5626f, 8.189f)
                curveTo(3.1491f, 8.212f, 2.8325f, 8.566f, 2.8555f, 8.9795f)
                lineTo(2.9342f, 10.3916f)
                curveTo(2.9572f, 10.8051f, 3.3112f, 11.1217f, 3.7247f, 11.0987f)
                curveTo(4.1383f, 11.0756f, 4.4549f, 10.7217f, 4.4318f, 10.3081f)
                lineTo(4.3532f, 8.8961f)
                curveTo(4.3302f, 8.4825f, 3.9762f, 8.1659f, 3.5626f, 8.189f)
                close()
            }
        }
        .build()
        return _donutBitten!!
    }

private var _donutBitten: ImageVector? = null

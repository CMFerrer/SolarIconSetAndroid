package dev.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.Donut: ImageVector
    get() {
        if (_donut != null) {
            return _donut!!
        }
        _donut = Builder(
            name = "Donut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.6772f, 14.531f)
                curveTo(19.1703f, 14.0391f, 19.4791f, 13.75f, 20.1526f, 13.75f)
                curveTo(20.7467f, 13.75f, 21.2865f, 13.9874f, 21.7349f, 14.2973f)
                curveTo(20.6968f, 18.7128f, 16.7323f, 22.0f, 12.0f, 22.0f)
                curveTo(7.4677f, 22.0f, 3.6396f, 18.9848f, 2.4123f, 14.8509f)
                curveTo(3.2374f, 15.3036f, 4.3008f, 15.75f, 5.3318f, 15.75f)
                curveTo(6.1455f, 15.75f, 6.9666f, 15.4733f, 7.6571f, 15.1522f)
                curveTo(8.1894f, 14.9048f, 8.6797f, 14.6139f, 9.0793f, 14.3522f)
                curveTo(9.7667f, 15.2047f, 10.8196f, 15.75f, 12.0f, 15.75f)
                curveTo(12.7517f, 15.75f, 13.4518f, 15.5288f, 14.0387f, 15.1479f)
                curveTo(14.6126f, 15.4845f, 15.3239f, 15.75f, 16.1426f, 15.75f)
                curveTo(17.4558f, 15.75f, 18.1486f, 15.0585f, 18.6561f, 14.5521f)
                lineTo(18.6772f, 14.531f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.75f, 12.0f)
                curveTo(9.75f, 10.7574f, 10.7574f, 9.75f, 12.0f, 9.75f)
                curveTo(13.2426f, 9.75f, 14.25f, 10.7574f, 14.25f, 12.0f)
                curveTo(14.25f, 13.2426f, 13.2426f, 14.25f, 12.0f, 14.25f)
                curveTo(10.7574f, 14.25f, 9.75f, 13.2426f, 9.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 8.25f)
                curveTo(9.9289f, 8.25f, 8.25f, 9.9289f, 8.25f, 12.0f)
                curveTo(8.25f, 12.3502f, 8.298f, 12.6892f, 8.3878f, 13.0107f)
                curveTo(8.0091f, 13.2659f, 7.5331f, 13.5557f, 7.0247f, 13.7921f)
                curveTo(6.4208f, 14.0729f, 5.8306f, 14.25f, 5.3318f, 14.25f)
                curveTo(4.572f, 14.25f, 3.6378f, 13.8433f, 2.8191f, 13.3557f)
                curveTo(2.5192f, 13.177f, 2.2515f, 12.9978f, 2.0351f, 12.8443f)
                curveTo(2.0119f, 12.566f, 2.0f, 12.2844f, 2.0f, 12.0f)
                curveTo(2.0f, 8.9981f, 3.3227f, 6.3051f, 5.4172f, 4.4721f)
                curveTo(5.4335f, 4.4922f, 5.451f, 4.5116f, 5.4697f, 4.5303f)
                lineTo(6.4697f, 5.5303f)
                curveTo(6.7626f, 5.8232f, 7.2374f, 5.8232f, 7.5303f, 5.5303f)
                curveTo(7.8232f, 5.2374f, 7.8232f, 4.7626f, 7.5303f, 4.4697f)
                lineTo(6.6259f, 3.5653f)
                curveTo(8.1781f, 2.5743f, 10.022f, 2.0f, 12.0f, 2.0f)
                curveTo(15.0019f, 2.0f, 17.6949f, 3.3227f, 19.5279f, 5.4172f)
                curveTo(19.5078f, 5.4335f, 19.4884f, 5.451f, 19.4697f, 5.4697f)
                lineTo(18.4697f, 6.4697f)
                curveTo(18.1768f, 6.7626f, 18.1768f, 7.2374f, 18.4697f, 7.5303f)
                curveTo(18.7626f, 7.8232f, 19.2374f, 7.8232f, 19.5303f, 7.5303f)
                lineTo(20.4347f, 6.6259f)
                curveTo(21.4257f, 8.1781f, 22.0f, 10.022f, 22.0f, 12.0f)
                curveTo(22.0f, 12.2351f, 21.9919f, 12.4683f, 21.9759f, 12.6993f)
                curveTo(21.4528f, 12.4364f, 20.8399f, 12.25f, 20.1526f, 12.25f)
                curveTo(18.8394f, 12.25f, 18.1465f, 12.9415f, 17.639f, 13.4479f)
                lineTo(17.6179f, 13.469f)
                curveTo(17.1248f, 13.9609f, 16.816f, 14.25f, 16.1426f, 14.25f)
                curveTo(15.7922f, 14.25f, 15.4596f, 14.168f, 15.1508f, 14.0343f)
                curveTo(15.5299f, 13.4483f, 15.75f, 12.7498f, 15.75f, 12.0f)
                curveTo(15.75f, 9.9289f, 14.0711f, 8.25f, 12.0f, 8.25f)
                close()
                moveTo(16.45f, 4.4f)
                curveTo(16.7814f, 4.6485f, 16.8485f, 5.1186f, 16.6f, 5.45f)
                lineTo(15.1f, 7.45f)
                curveTo(14.8515f, 7.7814f, 14.3814f, 7.8485f, 14.05f, 7.6f)
                curveTo(13.7186f, 7.3515f, 13.6515f, 6.8814f, 13.9f, 6.55f)
                lineTo(15.4f, 4.55f)
                curveTo(15.6485f, 4.2186f, 16.1186f, 4.1515f, 16.45f, 4.4f)
                close()
                moveTo(10.4697f, 3.4697f)
                curveTo(10.1768f, 3.7626f, 10.1768f, 4.2374f, 10.4697f, 4.5303f)
                lineTo(11.4697f, 5.5303f)
                curveTo(11.7626f, 5.8232f, 12.2374f, 5.8232f, 12.5303f, 5.5303f)
                curveTo(12.8232f, 5.2374f, 12.8232f, 4.7626f, 12.5303f, 4.4697f)
                lineTo(11.5303f, 3.4697f)
                curveTo(11.2374f, 3.1768f, 10.7626f, 3.1768f, 10.4697f, 3.4697f)
                close()
                moveTo(8.4095f, 7.5601f)
                curveTo(8.5167f, 7.9602f, 8.928f, 8.1977f, 9.3281f, 8.0905f)
                lineTo(10.6941f, 7.7244f)
                curveTo(11.0942f, 7.6172f, 11.3317f, 7.206f, 11.2244f, 6.8059f)
                curveTo(11.1172f, 6.4058f, 10.706f, 6.1684f, 10.3059f, 6.2756f)
                lineTo(8.9399f, 6.6416f)
                curveTo(8.5398f, 6.7488f, 8.3023f, 7.16f, 8.4095f, 7.5601f)
                close()
                moveTo(16.7515f, 11.1383f)
                curveTo(17.1652f, 11.1189f, 17.4849f, 10.7677f, 17.4654f, 10.3539f)
                lineTo(17.399f, 8.9413f)
                curveTo(17.3796f, 8.5275f, 17.0284f, 8.2079f, 16.6146f, 8.2273f)
                curveTo(16.2009f, 8.2468f, 15.8812f, 8.598f, 15.9007f, 9.0117f)
                lineTo(15.9671f, 10.4244f)
                curveTo(15.9865f, 10.8381f, 16.3377f, 11.1578f, 16.7515f, 11.1383f)
                close()
                moveTo(18.9413f, 11.5539f)
                curveTo(19.2151f, 11.8648f, 19.689f, 11.8948f, 19.9998f, 11.6211f)
                lineTo(21.1734f, 10.6479f)
                curveTo(21.4843f, 10.3741f, 21.5143f, 9.9002f, 21.2406f, 9.5893f)
                curveTo(20.9668f, 9.2785f, 20.4929f, 9.2484f, 20.182f, 9.5222f)
                lineTo(19.0085f, 10.4954f)
                curveTo(18.6976f, 10.7691f, 18.6675f, 11.2431f, 18.9413f, 11.5539f)
                close()
                moveTo(5.8969f, 7.1736f)
                curveTo(5.5198f, 7.345f, 5.353f, 7.7897f, 5.5244f, 8.1668f)
                lineTo(6.1097f, 9.4542f)
                curveTo(6.2811f, 9.8313f, 6.7257f, 9.998f, 7.1028f, 9.8266f)
                curveTo(7.4799f, 9.6552f, 7.6466f, 9.2106f, 7.4752f, 8.8335f)
                lineTo(6.89f, 7.5461f)
                curveTo(6.7186f, 7.169f, 6.2739f, 7.0022f, 5.8969f, 7.1736f)
                close()
                moveTo(6.9431f, 10.8949f)
                curveTo(7.2773f, 11.1396f, 7.35f, 11.6089f, 7.1054f, 11.9431f)
                lineTo(6.2701f, 13.0843f)
                curveTo(6.0255f, 13.4186f, 5.5562f, 13.4912f, 5.222f, 13.2466f)
                curveTo(4.8877f, 13.002f, 4.815f, 12.5327f, 5.0597f, 12.1984f)
                lineTo(5.8949f, 11.0572f)
                curveTo(6.1395f, 10.723f, 6.6088f, 10.6503f, 6.9431f, 10.8949f)
                close()
                moveTo(3.5623f, 8.1888f)
                curveTo(3.1488f, 8.2119f, 2.8322f, 8.5658f, 2.8552f, 8.9794f)
                lineTo(2.9339f, 10.3914f)
                curveTo(2.9569f, 10.805f, 3.3109f, 11.1216f, 3.7244f, 11.0985f)
                curveTo(4.138f, 11.0755f, 4.4546f, 10.7216f, 4.4316f, 10.308f)
                lineTo(4.3529f, 8.896f)
                curveTo(4.3299f, 8.4824f, 3.9759f, 8.1658f, 3.5623f, 8.1888f)
                close()
            }
        }
            .build()
        return _donut!!
    }

private var _donut: ImageVector? = null

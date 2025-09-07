package com.chiksmedina.solar.boldduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.FoodKitchenGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 12.3539f, 2.0184f, 12.7036f, 2.0543f, 13.048f)
                curveTo(2.4031f, 13.3523f, 4.367f, 15.0f, 6.0f, 15.0f)
                curveTo(7.212f, 15.0f, 8.6063f, 14.0924f, 9.3872f, 13.5f)
                lineTo(9.3962f, 13.4911f)
                curveTo(9.1441f, 13.0518f, 9.0f, 12.5427f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 12.8851f, 14.6167f, 13.6807f, 14.007f, 14.2298f)
                curveTo(14.4774f, 14.6425f, 15.0911f, 15.0f, 15.8053f, 15.0f)
                curveTo(17.4948f, 15.0f, 17.4948f, 13.0f, 19.1842f, 13.0f)
                curveTo(20.2618f, 13.0f, 21.1102f, 13.8136f, 21.5835f, 14.4029f)
                lineTo(21.6758f, 14.5353f)
                curveTo(21.8874f, 13.7256f, 22.0f, 12.876f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.3872f, 13.5f)
                curveTo(8.6062f, 14.0924f, 7.2119f, 15.0f, 5.9999f, 15.0f)
                curveTo(4.3669f, 15.0f, 2.403f, 13.3523f, 2.0542f, 13.048f)
                curveTo(2.5781f, 18.0783f, 6.831f, 22.0f, 11.9999f, 22.0f)
                curveTo(16.6468f, 22.0f, 20.5534f, 18.8304f, 21.6757f, 14.5353f)
                lineTo(21.5834f, 14.4029f)
                curveTo(21.1102f, 13.8136f, 20.2617f, 13.0f, 19.1842f, 13.0f)
                curveTo(17.4947f, 13.0f, 17.4947f, 15.0f, 15.8053f, 15.0f)
                curveTo(15.091f, 15.0f, 14.4774f, 14.6425f, 14.007f, 14.2298f)
                curveTo(13.4754f, 14.7086f, 12.7717f, 15.0f, 11.9999f, 15.0f)
                curveTo(10.8858f, 15.0f, 9.9136f, 14.3927f, 9.3961f, 13.4911f)
                lineTo(9.3872f, 13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.5279f, 5.4172f)
                curveTo(19.5078f, 5.4335f, 19.4884f, 5.451f, 19.4697f, 5.4697f)
                lineTo(18.4697f, 6.4697f)
                curveTo(18.1768f, 6.7626f, 18.1768f, 7.2374f, 18.4697f, 7.5303f)
                curveTo(18.7626f, 7.8232f, 19.2374f, 7.8232f, 19.5303f, 7.5303f)
                lineTo(20.4347f, 6.6259f)
                curveTo(20.1627f, 6.2f, 19.8594f, 5.7959f, 19.5279f, 5.4172f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.4172f, 4.4721f)
                curveTo(5.4335f, 4.4922f, 5.451f, 4.5116f, 5.4697f, 4.5303f)
                lineTo(6.4697f, 5.5303f)
                curveTo(6.7626f, 5.8232f, 7.2374f, 5.8232f, 7.5303f, 5.5303f)
                curveTo(7.8232f, 5.2374f, 7.8232f, 4.7626f, 7.5303f, 4.4697f)
                lineTo(6.6259f, 3.5653f)
                curveTo(6.2f, 3.8373f, 5.7959f, 4.1406f, 5.4172f, 4.4721f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.4697f, 4.5303f)
                curveTo(10.1768f, 4.2374f, 10.1768f, 3.7626f, 10.4697f, 3.4697f)
                curveTo(10.7626f, 3.1768f, 11.2374f, 3.1768f, 11.5303f, 3.4697f)
                lineTo(12.5303f, 4.4697f)
                curveTo(12.8232f, 4.7626f, 12.8232f, 5.2374f, 12.5303f, 5.5303f)
                curveTo(12.2374f, 5.8232f, 11.7626f, 5.8232f, 11.4697f, 5.5303f)
                lineTo(10.4697f, 4.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.6f, 5.45f)
                curveTo(16.8485f, 5.1186f, 16.7814f, 4.6485f, 16.45f, 4.4f)
                curveTo(16.1186f, 4.1515f, 15.6485f, 4.2186f, 15.4f, 4.55f)
                lineTo(13.9f, 6.55f)
                curveTo(13.6515f, 6.8814f, 13.7186f, 7.3515f, 14.05f, 7.6f)
                curveTo(14.3814f, 7.8485f, 14.8515f, 7.7814f, 15.1f, 7.45f)
                lineTo(16.6f, 5.45f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.4095f, 7.5601f)
                curveTo(8.5167f, 7.9602f, 8.928f, 8.1977f, 9.3281f, 8.0905f)
                lineTo(10.6941f, 7.7244f)
                curveTo(11.0942f, 7.6172f, 11.3317f, 7.206f, 11.2244f, 6.8059f)
                curveTo(11.1172f, 6.4058f, 10.706f, 6.1684f, 10.3059f, 6.2756f)
                lineTo(8.9399f, 6.6416f)
                curveTo(8.5398f, 6.7488f, 8.3023f, 7.16f, 8.4095f, 7.5601f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.4653f, 10.354f)
                curveTo(17.4847f, 10.7678f, 17.1651f, 11.119f, 16.7513f, 11.1384f)
                curveTo(16.3376f, 11.1579f, 15.9864f, 10.8382f, 15.967f, 10.4245f)
                lineTo(15.9006f, 9.0118f)
                curveTo(15.8811f, 8.5981f, 16.2008f, 8.2469f, 16.6145f, 8.2274f)
                curveTo(17.0283f, 8.208f, 17.3795f, 8.5276f, 17.3989f, 8.9414f)
                lineTo(17.4653f, 10.354f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.4368f, 12.0586f)
                curveTo(18.7106f, 12.3694f, 19.1845f, 12.3995f, 19.4953f, 12.1257f)
                lineTo(21.1734f, 10.6479f)
                curveTo(21.4843f, 10.3741f, 21.5143f, 9.9002f, 21.2406f, 9.5893f)
                curveTo(20.9668f, 9.2785f, 20.4929f, 9.2484f, 20.182f, 9.5222f)
                lineTo(18.504f, 11.0f)
                curveTo(18.1931f, 11.2738f, 18.163f, 11.7477f, 18.4368f, 12.0586f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.5244f, 8.1668f)
                curveTo(5.353f, 7.7897f, 5.5198f, 7.345f, 5.8969f, 7.1736f)
                curveTo(6.2739f, 7.0022f, 6.7186f, 7.169f, 6.89f, 7.5461f)
                lineTo(7.4752f, 8.8335f)
                curveTo(7.6466f, 9.2106f, 7.4799f, 9.6552f, 7.1028f, 9.8266f)
                curveTo(6.7257f, 9.998f, 6.2811f, 9.8313f, 6.1097f, 9.4542f)
                lineTo(5.5244f, 8.1668f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.9429f, 10.895f)
                curveTo(7.2772f, 11.1397f, 7.3499f, 11.6089f, 7.1052f, 11.9432f)
                lineTo(6.27f, 13.0844f)
                curveTo(6.0254f, 13.4187f, 5.5561f, 13.4913f, 5.2218f, 13.2467f)
                curveTo(4.8876f, 13.0021f, 4.8149f, 12.5328f, 5.0595f, 12.1985f)
                lineTo(5.8948f, 11.0573f)
                curveTo(6.1394f, 10.723f, 6.6087f, 10.6504f, 6.9429f, 10.895f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.8554f, 8.9793f)
                curveTo(2.8324f, 8.5657f, 3.149f, 8.2118f, 3.5626f, 8.1887f)
                curveTo(3.9761f, 8.1657f, 4.3301f, 8.4823f, 4.3531f, 8.8959f)
                lineTo(4.4318f, 10.3079f)
                curveTo(4.4548f, 10.7214f, 4.1382f, 11.0754f, 3.7246f, 11.0984f)
                curveTo(3.3111f, 11.1215f, 2.9571f, 10.8049f, 2.9341f, 10.3913f)
                lineTo(2.8554f, 8.9793f)
                close()
            }
        }
            .build()
        return _donut!!
    }

private var _donut: ImageVector? = null

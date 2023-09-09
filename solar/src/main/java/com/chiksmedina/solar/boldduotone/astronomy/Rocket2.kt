package com.chiksmedina.solar.boldduotone.astronomy

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
import com.chiksmedina.solar.boldduotone.AstronomyGroup

public val AstronomyGroup.Rocket2: ImageVector
    get() {
        if (_rocket2 != null) {
            return _rocket2!!
        }
        _rocket2 = Builder(name = "Rocket2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.5023f, 14.3674f)
                lineTo(20.5319f, 9.3529f)
                curveTo(21.2563f, 8.6307f, 21.6185f, 8.2696f, 21.8092f, 7.8105f)
                curveTo(22.0f, 7.3513f, 22.0f, 6.8407f, 22.0f, 5.8194f)
                verticalLineTo(5.3315f)
                curveTo(22.0f, 3.761f, 22.0f, 2.9758f, 21.5106f, 2.4879f)
                curveTo(21.0213f, 2.0f, 20.2337f, 2.0f, 18.6585f, 2.0f)
                horizontalLineTo(18.1691f)
                curveTo(17.1447f, 2.0f, 16.6325f, 2.0f, 16.172f, 2.1902f)
                curveTo(15.7114f, 2.3804f, 15.3493f, 2.7415f, 14.6249f, 3.4636f)
                lineTo(9.5952f, 8.4782f)
                curveTo(8.7488f, 9.322f, 8.224f, 9.8453f, 8.0208f, 10.3506f)
                curveTo(7.9566f, 10.5103f, 7.9245f, 10.6682f, 7.9245f, 10.8339f)
                curveTo(7.9245f, 11.5238f, 8.4814f, 12.0791f, 9.5952f, 13.1896f)
                lineTo(9.7449f, 13.3388f)
                lineTo(11.4985f, 11.5591f)
                curveTo(11.7486f, 11.3053f, 12.1571f, 11.3022f, 12.4109f, 11.5523f)
                curveTo(12.6647f, 11.8024f, 12.6678f, 12.2109f, 12.4177f, 12.4647f)
                lineTo(10.6587f, 14.2499f)
                lineTo(10.7766f, 14.3674f)
                curveTo(11.8905f, 15.4779f, 12.4474f, 16.0331f, 13.1394f, 16.0331f)
                curveTo(13.2924f, 16.0331f, 13.4387f, 16.006f, 13.5858f, 15.9518f)
                curveTo(14.1048f, 15.7607f, 14.6345f, 15.2325f, 15.5023f, 14.3674f)
                close()
                moveTo(17.8652f, 8.4785f)
                curveTo(17.2127f, 9.129f, 16.1548f, 9.129f, 15.5024f, 8.4785f)
                curveTo(14.8499f, 7.828f, 14.8499f, 6.7733f, 15.5024f, 6.1228f)
                curveTo(16.1548f, 5.4723f, 17.2127f, 5.4723f, 17.8652f, 6.1228f)
                curveTo(18.5177f, 6.7733f, 18.5177f, 7.828f, 17.8652f, 8.4785f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.7741f, 12.4814f)
                curveTo(3.0703f, 12.778f, 3.07f, 13.2586f, 2.7734f, 13.5548f)
                lineTo(2.6178f, 13.7103f)
                curveTo(2.4848f, 13.8431f, 2.4848f, 14.058f, 2.6178f, 14.1908f)
                curveTo(2.7513f, 14.3241f, 2.968f, 14.3241f, 3.1015f, 14.1908f)
                lineTo(4.8136f, 12.4807f)
                curveTo(5.1102f, 12.1845f, 5.5908f, 12.1848f, 5.887f, 12.4814f)
                curveTo(6.1833f, 12.778f, 6.183f, 13.2586f, 5.8864f, 13.5548f)
                lineTo(4.1743f, 15.2648f)
                curveTo(3.4481f, 15.9901f, 2.2712f, 15.9901f, 1.545f, 15.2648f)
                curveTo(0.8183f, 14.5391f, 0.8183f, 13.362f, 1.545f, 12.6362f)
                lineTo(1.7006f, 12.4807f)
                curveTo(1.9972f, 12.1845f, 2.4778f, 12.1848f, 2.7741f, 12.4814f)
                close()
                moveTo(7.2972f, 16.696f)
                curveTo(7.5903f, 16.9957f, 7.5849f, 17.4762f, 7.2853f, 17.7693f)
                lineTo(5.5551f, 19.4614f)
                curveTo(5.2554f, 19.7545f, 4.7748f, 19.7491f, 4.4817f, 19.4494f)
                curveTo(4.1886f, 19.1497f, 4.194f, 18.6692f, 4.4936f, 18.3761f)
                lineTo(6.2238f, 16.684f)
                curveTo(6.5235f, 16.3909f, 7.0041f, 16.3963f, 7.2972f, 16.696f)
                close()
                moveTo(11.4811f, 18.118f)
                curveTo(11.7774f, 18.4146f, 11.7771f, 18.8952f, 11.4805f, 19.1915f)
                lineTo(9.7683f, 20.9015f)
                curveTo(9.6354f, 21.0343f, 9.6354f, 21.2492f, 9.7683f, 21.382f)
                curveTo(9.9018f, 21.5153f, 10.1186f, 21.5153f, 10.252f, 21.382f)
                lineTo(10.4077f, 21.2265f)
                curveTo(10.7043f, 20.9303f, 11.1849f, 20.9306f, 11.4811f, 21.2272f)
                curveTo(11.7774f, 21.5238f, 11.7771f, 22.0044f, 11.4805f, 22.3006f)
                lineTo(11.3248f, 22.4561f)
                curveTo(10.5987f, 23.1813f, 9.4217f, 23.1813f, 8.6956f, 22.4561f)
                curveTo(7.9689f, 21.7303f, 7.9689f, 20.5532f, 8.6956f, 19.8274f)
                lineTo(10.4077f, 18.1174f)
                curveTo(10.7043f, 17.8211f, 11.1849f, 17.8214f, 11.4811f, 18.118f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.8466f, 5.4092f)
                lineTo(8.6589f, 7.5904f)
                curveTo(8.2567f, 7.9913f, 7.8879f, 8.359f, 7.5965f, 8.6915f)
                curveTo(7.4095f, 8.9049f, 7.2225f, 9.1386f, 7.0642f, 9.3968f)
                lineTo(7.0429f, 9.3755f)
                curveTo(7.0024f, 9.3352f, 6.9821f, 9.315f, 6.9618f, 9.2953f)
                curveTo(6.5816f, 8.9263f, 6.1343f, 8.633f, 5.6439f, 8.431f)
                curveTo(5.6177f, 8.4202f, 5.5911f, 8.4096f, 5.5379f, 8.3886f)
                lineTo(5.2122f, 8.2595f)
                curveTo(4.7709f, 8.0846f, 4.6533f, 7.5166f, 4.9891f, 7.1818f)
                curveTo(5.9527f, 6.2211f, 7.1097f, 5.0676f, 7.6681f, 4.836f)
                curveTo(8.1605f, 4.6317f, 8.6925f, 4.5637f, 9.2055f, 4.6395f)
                curveTo(9.6756f, 4.709f, 10.1203f, 4.9504f, 10.8466f, 5.4092f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5821f, 16.8934f)
                curveTo(14.7583f, 17.0723f, 14.8754f, 17.1987f, 14.9813f, 17.3337f)
                curveTo(15.1209f, 17.5119f, 15.2458f, 17.7012f, 15.3546f, 17.8996f)
                curveTo(15.4772f, 18.123f, 15.5723f, 18.3616f, 15.7626f, 18.8389f)
                curveTo(15.9174f, 19.2274f, 16.432f, 19.3301f, 16.7308f, 19.0322f)
                lineTo(16.8031f, 18.9601f)
                curveTo(17.7667f, 17.9993f, 18.9237f, 16.8458f, 19.1561f, 16.2891f)
                curveTo(19.361f, 15.7982f, 19.4292f, 15.2678f, 19.3531f, 14.7563f)
                curveTo(19.2835f, 14.2877f, 19.0413f, 13.8444f, 18.5812f, 13.1205f)
                lineTo(16.3862f, 15.3089f)
                curveTo(15.975f, 15.7189f, 15.5979f, 16.0949f, 15.2569f, 16.3894f)
                curveTo(15.0525f, 16.5659f, 14.8289f, 16.7423f, 14.5821f, 16.8934f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.6867f, 14.5633f)
                curveTo(7.9831f, 14.2669f, 7.9831f, 13.7863f, 7.6867f, 13.4899f)
                curveTo(7.3903f, 13.1935f, 6.9097f, 13.1935f, 6.6133f, 13.4899f)
                lineTo(4.4708f, 15.6323f)
                curveTo(4.1744f, 15.9287f, 4.1744f, 16.4093f, 4.4708f, 16.7057f)
                curveTo(4.7673f, 17.0021f, 5.2479f, 17.0021f, 5.5443f, 16.7057f)
                lineTo(7.6867f, 14.5633f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4959f, 17.369f)
                curveTo(10.7923f, 17.0726f, 10.7923f, 16.592f, 10.4959f, 16.2956f)
                curveTo(10.1994f, 15.9992f, 9.7188f, 15.9992f, 9.4224f, 16.2956f)
                lineTo(7.2947f, 18.4233f)
                curveTo(6.9982f, 18.7198f, 6.9982f, 19.2003f, 7.2947f, 19.4968f)
                curveTo(7.5911f, 19.7932f, 8.0717f, 19.7932f, 8.3681f, 19.4968f)
                lineTo(10.4959f, 17.369f)
                close()
            }
        }
        .build()
        return _rocket2!!
    }

private var _rocket2: ImageVector? = null

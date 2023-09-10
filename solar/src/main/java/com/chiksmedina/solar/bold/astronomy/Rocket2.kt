package com.chiksmedina.solar.bold.astronomy

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
import com.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Rocket2: ImageVector
    get() {
        if (_rocket2 != null) {
            return _rocket2!!
        }
        _rocket2 = Builder(
            name = "Rocket2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
                moveTo(7.6866f, 13.4896f)
                curveTo(7.9831f, 13.7861f, 7.9831f, 14.2667f, 7.6866f, 14.5631f)
                lineTo(5.5442f, 16.7055f)
                curveTo(5.2478f, 17.0019f, 4.7672f, 17.0019f, 4.4708f, 16.7055f)
                curveTo(4.1744f, 16.409f, 4.1744f, 15.9285f, 4.4708f, 15.632f)
                lineTo(6.6132f, 13.4896f)
                curveTo(6.9096f, 13.1932f, 7.3902f, 13.1932f, 7.6866f, 13.4896f)
                close()
                moveTo(10.4958f, 16.2953f)
                curveTo(10.7922f, 16.5918f, 10.7922f, 17.0724f, 10.4958f, 17.3688f)
                lineTo(8.368f, 19.4965f)
                curveTo(8.0716f, 19.7929f, 7.591f, 19.7929f, 7.2946f, 19.4965f)
                curveTo(6.9982f, 19.2001f, 6.9982f, 18.7195f, 7.2946f, 18.4231f)
                lineTo(9.4224f, 16.2953f)
                curveTo(9.7188f, 15.9989f, 10.1994f, 15.9989f, 10.4958f, 16.2953f)
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.8463f, 5.4091f)
                lineTo(8.6586f, 7.5902f)
                curveTo(8.2565f, 7.9911f, 7.8876f, 8.3589f, 7.5963f, 8.6913f)
                curveTo(7.4092f, 8.9048f, 7.2223f, 9.1385f, 7.0639f, 9.3967f)
                lineTo(7.0426f, 9.3754f)
                curveTo(7.0022f, 9.3351f, 6.9819f, 9.3149f, 6.9616f, 9.2952f)
                curveTo(6.5813f, 8.9262f, 6.1341f, 8.6329f, 5.6437f, 8.4308f)
                curveTo(5.6175f, 8.42f, 5.5909f, 8.4095f, 5.5377f, 8.3884f)
                lineTo(5.212f, 8.2594f)
                curveTo(4.7707f, 8.0845f, 4.6531f, 7.5164f, 4.9889f, 7.1817f)
                curveTo(5.9525f, 6.221f, 7.1095f, 5.0675f, 7.6679f, 4.8358f)
                curveTo(8.1603f, 4.6315f, 8.6923f, 4.5635f, 9.2053f, 4.6394f)
                curveTo(9.6754f, 4.7088f, 10.1201f, 4.9503f, 10.8463f, 5.4091f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5818f, 16.8932f)
                curveTo(14.7581f, 17.0722f, 14.8752f, 17.1985f, 14.981f, 17.3336f)
                curveTo(15.1207f, 17.5118f, 15.2456f, 17.7011f, 15.3544f, 17.8995f)
                curveTo(15.4769f, 18.1229f, 15.5721f, 18.3615f, 15.7623f, 18.8388f)
                curveTo(15.9172f, 19.2273f, 16.4317f, 19.33f, 16.7306f, 19.032f)
                lineTo(16.8029f, 18.9599f)
                curveTo(17.7665f, 17.9992f, 18.9235f, 16.8457f, 19.1558f, 16.289f)
                curveTo(19.3608f, 15.7981f, 19.429f, 15.2677f, 19.3529f, 14.7562f)
                curveTo(19.2832f, 14.2876f, 19.0411f, 13.8443f, 18.581f, 13.1204f)
                lineTo(16.386f, 15.3088f)
                curveTo(15.9748f, 15.7188f, 15.5977f, 16.0948f, 15.2567f, 16.3893f)
                curveTo(15.0523f, 16.5658f, 14.8287f, 16.7422f, 14.5818f, 16.8932f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
        }
            .build()
        return _rocket2!!
    }

private var _rocket2: ImageVector? = null

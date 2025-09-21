package dev.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Planet3: ImageVector
    get() {
        if (_planet3 != null) {
            return _planet3!!
        }
        _planet3 = Builder(
            name = "Planet3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.7753f, 14.1178f)
                curveTo(21.9225f, 13.4352f, 22.0f, 12.7266f, 22.0f, 12.0f)
                curveTo(22.0f, 10.8786f, 21.8154f, 9.8003f, 21.475f, 8.7939f)
                lineTo(20.9481f, 8.7561f)
                lineTo(20.947f, 8.756f)
                lineTo(20.9374f, 8.7555f)
                curveTo(20.9272f, 8.7549f, 20.91f, 8.7541f, 20.886f, 8.7532f)
                curveTo(20.838f, 8.7515f, 20.7629f, 8.7498f, 20.6632f, 8.7502f)
                curveTo(20.4637f, 8.7511f, 20.1661f, 8.7606f, 19.7895f, 8.7965f)
                curveTo(19.0358f, 8.8682f, 17.9699f, 9.0448f, 16.7431f, 9.4654f)
                curveTo(16.4799f, 9.5556f, 16.1798f, 9.7178f, 15.785f, 9.9511f)
                curveTo(15.7058f, 9.9979f, 15.623f, 10.0474f, 15.537f, 10.0988f)
                curveTo(15.2148f, 10.2915f, 14.8462f, 10.5119f, 14.449f, 10.7194f)
                curveTo(13.419f, 11.2576f, 12.1263f, 11.7501f, 10.437f, 11.7501f)
                curveTo(8.019f, 11.7501f, 6.0305f, 10.9464f, 4.6562f, 10.1537f)
                curveTo(3.9678f, 9.7565f, 3.4274f, 9.3588f, 3.0565f, 9.0578f)
                curveTo(2.8709f, 8.9071f, 2.727f, 8.7802f, 2.6276f, 8.6889f)
                curveTo(2.6095f, 8.6722f, 2.5928f, 8.6567f, 2.5776f, 8.6425f)
                curveTo(2.2036f, 9.6919f, 2.0f, 10.8222f, 2.0f, 12.0f)
                curveTo(2.0f, 12.4304f, 2.0272f, 12.8544f, 2.0799f, 13.2705f)
                lineTo(2.4641f, 13.2512f)
                lineTo(2.4667f, 13.2511f)
                lineTo(2.4746f, 13.2507f)
                lineTo(2.5017f, 13.2496f)
                curveTo(2.5247f, 13.2488f, 2.5572f, 13.2477f, 2.5988f, 13.2467f)
                curveTo(2.6821f, 13.2447f, 2.8016f, 13.243f, 2.9528f, 13.2439f)
                curveTo(3.2551f, 13.2457f, 3.6848f, 13.2577f, 4.2047f, 13.2984f)
                curveTo(5.2416f, 13.3796f, 6.6516f, 13.5759f, 8.1282f, 14.0405f)
                curveTo(8.5788f, 14.1823f, 9.027f, 14.4139f, 9.4552f, 14.646f)
                curveTo(9.5548f, 14.7f, 9.654f, 14.7544f, 9.7535f, 14.809f)
                curveTo(10.0999f, 14.9991f, 10.4512f, 15.1917f, 10.8405f, 15.3785f)
                curveTo(11.8204f, 15.8483f, 12.9851f, 16.2502f, 14.5092f, 16.2502f)
                curveTo(15.8918f, 16.2502f, 17.1709f, 15.9058f, 18.3115f, 15.4842f)
                curveTo(18.8824f, 15.2733f, 19.4099f, 15.0464f, 19.9021f, 14.8347f)
                lineTo(19.9204f, 14.8268f)
                curveTo(20.3949f, 14.6227f, 20.8566f, 14.4241f, 21.2628f, 14.2887f)
                lineTo(21.7753f, 14.1178f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.2059f, 15.9119f)
                curveTo(20.9923f, 15.9989f, 20.7567f, 16.1f, 20.4948f, 16.2127f)
                lineTo(20.4846f, 16.217f)
                curveTo(19.9984f, 16.4262f, 19.4401f, 16.6663f, 18.8315f, 16.8912f)
                curveTo(17.6047f, 17.3446f, 16.1384f, 17.7502f, 14.5092f, 17.7502f)
                curveTo(12.696f, 17.7502f, 11.3065f, 17.2655f, 10.1919f, 16.731f)
                curveTo(9.7617f, 16.5247f, 9.3636f, 16.3062f, 9.0127f, 16.1136f)
                curveTo(8.9185f, 16.0619f, 8.8274f, 16.0119f, 8.7403f, 15.9647f)
                curveTo(8.3109f, 15.7319f, 7.9761f, 15.5652f, 7.678f, 15.4714f)
                curveTo(6.3403f, 15.0505f, 5.0487f, 14.8691f, 4.0876f, 14.7938f)
                curveTo(3.6085f, 14.7563f, 3.2153f, 14.7454f, 2.9441f, 14.7439f)
                curveTo(2.8087f, 14.7431f, 2.704f, 14.7446f, 2.6347f, 14.7463f)
                curveTo(2.6f, 14.7471f, 2.5742f, 14.748f, 2.5578f, 14.7486f)
                lineTo(2.5404f, 14.7493f)
                lineTo(2.5376f, 14.7494f)
                lineTo(2.3849f, 14.7571f)
                curveTo(3.5819f, 18.9391f, 7.4335f, 22.0f, 12.0f, 22.0f)
                curveTo(16.1347f, 22.0f, 19.6832f, 19.4907f, 21.2059f, 15.9119f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.7096f, 8.293f)
                curveTo(2.7814f, 8.2224f, 2.8744f, 8.1311f, 2.9947f, 8.013f)
                lineTo(2.7096f, 8.293f)
                curveTo(2.7096f, 8.2931f, 2.7097f, 8.2929f, 2.7096f, 8.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.2369f, 7.1787f)
                lineTo(3.5341f, 7.4814f)
                lineTo(3.5372f, 7.4846f)
                lineTo(3.556f, 7.5029f)
                curveTo(3.5739f, 7.5204f, 3.6028f, 7.5479f, 3.6421f, 7.584f)
                curveTo(3.721f, 7.6564f, 3.8417f, 7.7632f, 4.0017f, 7.8931f)
                curveTo(4.3222f, 8.1531f, 4.7974f, 8.5034f, 5.4057f, 8.8544f)
                curveTo(6.625f, 9.5577f, 8.3551f, 10.2501f, 10.437f, 10.2501f)
                curveTo(11.8107f, 10.2501f, 12.8622f, 9.8561f, 13.7543f, 9.39f)
                curveTo(14.1094f, 9.2044f, 14.4292f, 9.0133f, 14.7468f, 8.8235f)
                curveTo(14.8384f, 8.7687f, 14.9299f, 8.714f, 15.022f, 8.6596f)
                curveTo(15.4142f, 8.4279f, 15.8327f, 8.1918f, 16.2567f, 8.0464f)
                curveTo(17.6128f, 7.5816f, 18.7969f, 7.3842f, 19.6474f, 7.3032f)
                curveTo(20.073f, 7.2627f, 20.4161f, 7.2513f, 20.6567f, 7.2502f)
                curveTo(20.7105f, 7.25f, 20.7592f, 7.2503f, 20.8025f, 7.2509f)
                curveTo(19.112f, 4.1241f, 15.8041f, 2.0f, 12.0f, 2.0f)
                curveTo(8.2253f, 2.0f, 4.9391f, 4.0914f, 3.2369f, 7.1787f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0228f, 7.6831f)
                lineTo(21.0f, 8.0062f)
                curveTo(21.0092f, 7.8779f, 21.0165f, 7.771f, 21.0228f, 7.6831f)
                curveTo(21.0227f, 7.6829f, 21.0229f, 7.6833f, 21.0228f, 7.6831f)
                close()
            }
        }
            .build()
        return _planet3!!
    }

private var _planet3: ImageVector? = null

package dev.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.TimeGroup

val TimeGroup.StopwatchPause: ImageVector
    get() {
        if (_stopwatchPause != null) {
            return _stopwatchPause!!
        }
        _stopwatchPause = Builder(
            name = "StopwatchPause", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 2.0f)
                curveTo(9.25f, 1.5858f, 9.5858f, 1.25f, 10.0f, 1.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 1.25f, 14.75f, 1.5858f, 14.75f, 2.0f)
                curveTo(14.75f, 2.4142f, 14.4142f, 2.75f, 14.0f, 2.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 2.75f, 9.25f, 2.4142f, 9.25f, 2.0f)
                close()
                moveTo(12.0f, 4.75f)
                curveTo(7.4436f, 4.75f, 3.75f, 8.4437f, 3.75f, 13.0f)
                curveTo(3.75f, 17.5563f, 7.4436f, 21.25f, 12.0f, 21.25f)
                curveTo(16.5563f, 21.25f, 20.25f, 17.5563f, 20.25f, 13.0f)
                curveTo(20.25f, 8.4437f, 16.5563f, 4.75f, 12.0f, 4.75f)
                close()
                moveTo(2.25f, 13.0f)
                curveTo(2.25f, 7.6152f, 6.6152f, 3.25f, 12.0f, 3.25f)
                curveTo(17.3848f, 3.25f, 21.75f, 7.6152f, 21.75f, 13.0f)
                curveTo(21.75f, 18.3848f, 17.3848f, 22.75f, 12.0f, 22.75f)
                curveTo(6.6152f, 22.75f, 2.25f, 18.3848f, 2.25f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.5587f, 8.2388f)
                horizontalLineTo(14.5152f)
                curveTo(14.3009f, 8.2388f, 14.1041f, 8.2388f, 13.9387f, 8.25f)
                curveTo(13.7611f, 8.2621f, 13.5658f, 8.2898f, 13.3673f, 8.372f)
                curveTo(12.9385f, 8.5496f, 12.5978f, 8.8903f, 12.4202f, 9.3191f)
                curveTo(12.3379f, 9.5176f, 12.3103f, 9.7129f, 12.2982f, 9.8906f)
                curveTo(12.2869f, 10.0559f, 12.2869f, 10.2527f, 12.287f, 10.467f)
                verticalLineTo(15.5105f)
                curveTo(12.2869f, 15.7248f, 12.2869f, 15.9217f, 12.2982f, 16.087f)
                curveTo(12.3103f, 16.2646f, 12.3379f, 16.46f, 12.4202f, 16.6585f)
                curveTo(12.5978f, 17.0873f, 12.9385f, 17.4279f, 13.3673f, 17.6056f)
                curveTo(13.5658f, 17.6878f, 13.7611f, 17.7154f, 13.9387f, 17.7275f)
                curveTo(14.1041f, 17.7388f, 14.3009f, 17.7388f, 14.5152f, 17.7388f)
                horizontalLineTo(14.5587f)
                curveTo(14.773f, 17.7388f, 14.9698f, 17.7388f, 15.1352f, 17.7275f)
                curveTo(15.3128f, 17.7154f, 15.5082f, 17.6878f, 15.7067f, 17.6056f)
                curveTo(16.1355f, 17.4279f, 16.4761f, 17.0873f, 16.6537f, 16.6585f)
                curveTo(16.736f, 16.46f, 16.7636f, 16.2646f, 16.7757f, 16.087f)
                curveTo(16.787f, 15.9217f, 16.787f, 15.7248f, 16.787f, 15.5105f)
                verticalLineTo(10.467f)
                curveTo(16.787f, 10.2527f, 16.787f, 10.0559f, 16.7757f, 9.8906f)
                curveTo(16.7636f, 9.7129f, 16.736f, 9.5176f, 16.6537f, 9.3191f)
                curveTo(16.4761f, 8.8903f, 16.1355f, 8.5496f, 15.7067f, 8.372f)
                curveTo(15.5082f, 8.2898f, 15.3128f, 8.2621f, 15.1352f, 8.25f)
                curveTo(14.9698f, 8.2388f, 14.773f, 8.2388f, 14.5587f, 8.2388f)
                close()
                moveTo(13.9383f, 9.7591f)
                curveTo(13.8794f, 9.7844f, 13.8325f, 9.8313f, 13.8073f, 9.8901f)
                curveTo(13.8054f, 9.8974f, 13.7993f, 9.9258f, 13.7947f, 9.9927f)
                curveTo(13.7874f, 10.1007f, 13.787f, 10.2455f, 13.787f, 10.4888f)
                verticalLineTo(15.4888f)
                curveTo(13.787f, 15.732f, 13.7874f, 15.8769f, 13.7947f, 15.9849f)
                curveTo(13.7993f, 16.0517f, 13.8054f, 16.0801f, 13.8073f, 16.0875f)
                curveTo(13.8325f, 16.1463f, 13.8794f, 16.1932f, 13.9383f, 16.2185f)
                curveTo(13.9456f, 16.2203f, 13.974f, 16.2264f, 14.0409f, 16.231f)
                curveTo(14.1489f, 16.2384f, 14.2937f, 16.2388f, 14.537f, 16.2388f)
                curveTo(14.7802f, 16.2388f, 14.9251f, 16.2384f, 15.0331f, 16.231f)
                curveTo(15.0999f, 16.2264f, 15.1283f, 16.2203f, 15.1357f, 16.2185f)
                curveTo(15.1945f, 16.1932f, 15.2414f, 16.1463f, 15.2667f, 16.0875f)
                curveTo(15.2685f, 16.0801f, 15.2746f, 16.0517f, 15.2792f, 15.9849f)
                curveTo(15.2866f, 15.8769f, 15.287f, 15.732f, 15.287f, 15.4888f)
                verticalLineTo(10.4888f)
                curveTo(15.287f, 10.2455f, 15.2866f, 10.1007f, 15.2792f, 9.9927f)
                curveTo(15.2746f, 9.9258f, 15.2685f, 9.8974f, 15.2667f, 9.8901f)
                curveTo(15.2414f, 9.8313f, 15.1945f, 9.7844f, 15.1357f, 9.7591f)
                curveTo(15.1283f, 9.7572f, 15.0999f, 9.7511f, 15.0331f, 9.7465f)
                curveTo(14.9251f, 9.7392f, 14.7802f, 9.7388f, 14.537f, 9.7388f)
                curveTo(14.2937f, 9.7388f, 14.1489f, 9.7392f, 14.0409f, 9.7465f)
                curveTo(13.974f, 9.7511f, 13.9456f, 9.7572f, 13.9383f, 9.7591f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0982f, 8.2611f)
                curveTo(9.9329f, 8.2498f, 9.736f, 8.2499f, 9.5218f, 8.2499f)
                horizontalLineTo(9.4782f)
                curveTo(9.264f, 8.2499f, 9.0671f, 8.2498f, 8.9018f, 8.2611f)
                curveTo(8.7241f, 8.2732f, 8.5288f, 8.3009f, 8.3303f, 8.3831f)
                curveTo(7.9015f, 8.5607f, 7.5608f, 8.9014f, 7.3832f, 9.3302f)
                curveTo(7.301f, 9.5287f, 7.2734f, 9.724f, 7.2613f, 9.9017f)
                curveTo(7.25f, 10.067f, 7.25f, 10.2638f, 7.25f, 10.4781f)
                verticalLineTo(15.5216f)
                curveTo(7.25f, 15.7359f, 7.25f, 15.9328f, 7.2613f, 16.0981f)
                curveTo(7.2734f, 16.2757f, 7.301f, 16.4711f, 7.3832f, 16.6696f)
                curveTo(7.5608f, 17.0984f, 7.9015f, 17.439f, 8.3303f, 17.6167f)
                curveTo(8.5288f, 17.6989f, 8.7241f, 17.7265f, 8.9018f, 17.7386f)
                curveTo(9.0671f, 17.7499f, 9.264f, 17.7499f, 9.4782f, 17.7499f)
                horizontalLineTo(9.5218f)
                curveTo(9.736f, 17.7499f, 9.9329f, 17.7499f, 10.0982f, 17.7386f)
                curveTo(10.2759f, 17.7265f, 10.4712f, 17.6989f, 10.6697f, 17.6167f)
                curveTo(11.0985f, 17.439f, 11.4392f, 17.0984f, 11.6168f, 16.6696f)
                curveTo(11.699f, 16.4711f, 11.7266f, 16.2757f, 11.7387f, 16.0981f)
                curveTo(11.75f, 15.9328f, 11.75f, 15.7359f, 11.75f, 15.5216f)
                verticalLineTo(10.4781f)
                curveTo(11.75f, 10.2638f, 11.75f, 10.067f, 11.7387f, 9.9017f)
                curveTo(11.7266f, 9.724f, 11.699f, 9.5287f, 11.6168f, 9.3302f)
                curveTo(11.4392f, 8.9014f, 11.0985f, 8.5607f, 10.6697f, 8.3831f)
                curveTo(10.4712f, 8.3009f, 10.2759f, 8.2732f, 10.0982f, 8.2611f)
                close()
                moveTo(8.9013f, 9.7702f)
                curveTo(8.8425f, 9.7955f, 8.7956f, 9.8423f, 8.7703f, 9.9012f)
                curveTo(8.7684f, 9.9085f, 8.7623f, 9.9369f, 8.7578f, 10.0038f)
                curveTo(8.7504f, 10.1118f, 8.75f, 10.2566f, 8.75f, 10.4999f)
                verticalLineTo(15.4999f)
                curveTo(8.75f, 15.7431f, 8.7504f, 15.888f, 8.7578f, 15.996f)
                curveTo(8.7623f, 16.0628f, 8.7684f, 16.0912f, 8.7703f, 16.0986f)
                curveTo(8.7956f, 16.1574f, 8.8425f, 16.2043f, 8.9013f, 16.2296f)
                curveTo(8.9087f, 16.2314f, 8.9371f, 16.2375f, 9.0039f, 16.2421f)
                curveTo(9.1119f, 16.2495f, 9.2568f, 16.2499f, 9.5f, 16.2499f)
                curveTo(9.7432f, 16.2499f, 9.8881f, 16.2495f, 9.9961f, 16.2421f)
                curveTo(10.0629f, 16.2375f, 10.0913f, 16.2314f, 10.0987f, 16.2296f)
                curveTo(10.1575f, 16.2043f, 10.2044f, 16.1574f, 10.2297f, 16.0986f)
                curveTo(10.2316f, 16.0912f, 10.2377f, 16.0628f, 10.2422f, 15.996f)
                curveTo(10.2496f, 15.888f, 10.25f, 15.7431f, 10.25f, 15.4999f)
                verticalLineTo(10.4999f)
                curveTo(10.25f, 10.2566f, 10.2496f, 10.1118f, 10.2422f, 10.0038f)
                curveTo(10.2377f, 9.9369f, 10.2316f, 9.9085f, 10.2297f, 9.9012f)
                curveTo(10.2044f, 9.8423f, 10.1575f, 9.7955f, 10.0987f, 9.7702f)
                curveTo(10.0913f, 9.7683f, 10.0629f, 9.7622f, 9.9961f, 9.7576f)
                curveTo(9.8881f, 9.7503f, 9.7432f, 9.7499f, 9.5f, 9.7499f)
                curveTo(9.2568f, 9.7499f, 9.1119f, 9.7503f, 9.0039f, 9.7576f)
                curveTo(8.9371f, 9.7622f, 8.9087f, 9.7683f, 8.9013f, 9.7702f)
                close()
            }
        }
            .build()
        return _stopwatchPause!!
    }

private var _stopwatchPause: ImageVector? = null

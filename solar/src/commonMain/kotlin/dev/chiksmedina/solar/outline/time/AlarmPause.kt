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

val TimeGroup.AlarmPause: ImageVector
    get() {
        if (_alarmPause != null) {
            return _alarmPause!!
        }
        _alarmPause = Builder(
            name = "AlarmPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.8975f, 2.6361f)
                curveTo(8.2488f, 2.4166f, 8.3556f, 1.9539f, 8.136f, 1.6026f)
                curveTo(7.9165f, 1.2514f, 7.4538f, 1.1446f, 7.1025f, 1.3641f)
                lineTo(3.1025f, 3.8641f)
                curveTo(2.7513f, 4.0836f, 2.6445f, 4.5463f, 2.864f, 4.8976f)
                curveTo(3.0835f, 5.2488f, 3.5462f, 5.3556f, 3.8975f, 5.1361f)
                lineTo(7.8975f, 2.6361f)
                close()
                moveTo(16.8975f, 1.3641f)
                curveTo(16.5462f, 1.1446f, 16.0835f, 1.2514f, 15.864f, 1.6026f)
                curveTo(15.6445f, 1.9539f, 15.7512f, 2.4166f, 16.1025f, 2.6361f)
                lineTo(20.1025f, 5.1361f)
                curveTo(20.4538f, 5.3556f, 20.9165f, 5.2488f, 21.136f, 4.8976f)
                curveTo(21.3555f, 4.5464f, 21.2488f, 4.0836f, 20.8975f, 3.8641f)
                lineTo(16.8975f, 1.3641f)
                close()
                moveTo(3.75f, 13.0001f)
                curveTo(3.75f, 8.4438f, 7.4436f, 4.7501f, 12.0f, 4.7501f)
                curveTo(16.5563f, 4.7501f, 20.25f, 8.4438f, 20.25f, 13.0001f)
                curveTo(20.25f, 17.5564f, 16.5563f, 21.2501f, 12.0f, 21.2501f)
                curveTo(7.4436f, 21.2501f, 3.75f, 17.5564f, 3.75f, 13.0001f)
                close()
                moveTo(12.0f, 3.2501f)
                curveTo(6.6152f, 3.2501f, 2.25f, 7.6153f, 2.25f, 13.0001f)
                curveTo(2.25f, 18.3849f, 6.6152f, 22.7501f, 12.0f, 22.7501f)
                curveTo(17.3848f, 22.7501f, 21.75f, 18.3849f, 21.75f, 13.0001f)
                curveTo(21.75f, 7.6153f, 17.3848f, 3.2501f, 12.0f, 3.2501f)
                close()
                moveTo(9.5218f, 8.2501f)
                horizontalLineTo(9.4782f)
                curveTo(9.264f, 8.2501f, 9.0671f, 8.2501f, 8.9018f, 8.2614f)
                curveTo(8.7241f, 8.2735f, 8.5288f, 8.3011f, 8.3303f, 8.3833f)
                curveTo(7.9015f, 8.5609f, 7.5608f, 8.9016f, 7.3832f, 9.3304f)
                curveTo(7.301f, 9.5289f, 7.2734f, 9.7242f, 7.2613f, 9.9019f)
                curveTo(7.25f, 10.0672f, 7.25f, 10.2641f, 7.25f, 10.4783f)
                verticalLineTo(15.5219f)
                curveTo(7.25f, 15.7361f, 7.25f, 15.933f, 7.2613f, 16.0983f)
                curveTo(7.2734f, 16.276f, 7.301f, 16.4713f, 7.3832f, 16.6698f)
                curveTo(7.5608f, 17.0986f, 7.9015f, 17.4393f, 8.3303f, 17.6169f)
                curveTo(8.5288f, 17.6991f, 8.7241f, 17.7267f, 8.9018f, 17.7388f)
                curveTo(9.0671f, 17.7501f, 9.264f, 17.7501f, 9.4782f, 17.7501f)
                horizontalLineTo(9.5218f)
                curveTo(9.736f, 17.7501f, 9.9329f, 17.7501f, 10.0982f, 17.7388f)
                curveTo(10.2759f, 17.7267f, 10.4712f, 17.6991f, 10.6697f, 17.6169f)
                curveTo(11.0985f, 17.4393f, 11.4392f, 17.0986f, 11.6168f, 16.6698f)
                curveTo(11.699f, 16.4713f, 11.7266f, 16.276f, 11.7387f, 16.0983f)
                curveTo(11.75f, 15.933f, 11.75f, 15.7361f, 11.75f, 15.5219f)
                verticalLineTo(10.4783f)
                curveTo(11.75f, 10.2641f, 11.75f, 10.0672f, 11.7387f, 9.9019f)
                curveTo(11.7266f, 9.7242f, 11.699f, 9.5289f, 11.6168f, 9.3304f)
                curveTo(11.4392f, 8.9016f, 11.0985f, 8.5609f, 10.6697f, 8.3833f)
                curveTo(10.4712f, 8.3011f, 10.2759f, 8.2735f, 10.0982f, 8.2614f)
                curveTo(9.9329f, 8.2501f, 9.736f, 8.2501f, 9.5218f, 8.2501f)
                close()
                moveTo(8.7703f, 9.9014f)
                curveTo(8.7956f, 9.8426f, 8.8425f, 9.7957f, 8.9013f, 9.7704f)
                curveTo(8.9087f, 9.7685f, 8.9371f, 9.7624f, 9.0039f, 9.7579f)
                curveTo(9.1119f, 9.7505f, 9.2568f, 9.7501f, 9.5f, 9.7501f)
                curveTo(9.7432f, 9.7501f, 9.8881f, 9.7505f, 9.9961f, 9.7579f)
                curveTo(10.0629f, 9.7624f, 10.0913f, 9.7685f, 10.0987f, 9.7704f)
                curveTo(10.1575f, 9.7957f, 10.2044f, 9.8426f, 10.2297f, 9.9014f)
                curveTo(10.2316f, 9.9088f, 10.2377f, 9.9372f, 10.2422f, 10.004f)
                curveTo(10.2496f, 10.112f, 10.25f, 10.2569f, 10.25f, 10.5001f)
                verticalLineTo(15.5001f)
                curveTo(10.25f, 15.7433f, 10.2496f, 15.8882f, 10.2422f, 15.9962f)
                curveTo(10.2377f, 16.063f, 10.2316f, 16.0914f, 10.2297f, 16.0988f)
                curveTo(10.2044f, 16.1576f, 10.1575f, 16.2045f, 10.0987f, 16.2298f)
                curveTo(10.0913f, 16.2317f, 10.0629f, 16.2378f, 9.9961f, 16.2423f)
                curveTo(9.8881f, 16.2497f, 9.7432f, 16.2501f, 9.5f, 16.2501f)
                curveTo(9.2568f, 16.2501f, 9.1119f, 16.2497f, 9.0039f, 16.2423f)
                curveTo(8.9371f, 16.2378f, 8.9087f, 16.2317f, 8.9013f, 16.2298f)
                curveTo(8.8425f, 16.2045f, 8.7956f, 16.1576f, 8.7703f, 16.0988f)
                curveTo(8.7684f, 16.0914f, 8.7623f, 16.063f, 8.7578f, 15.9962f)
                curveTo(8.7504f, 15.8882f, 8.75f, 15.7433f, 8.75f, 15.5001f)
                verticalLineTo(10.5001f)
                curveTo(8.75f, 10.2569f, 8.7504f, 10.112f, 8.7578f, 10.004f)
                curveTo(8.7623f, 9.9372f, 8.7684f, 9.9088f, 8.7703f, 9.9014f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.5587f, 8.239f)
                horizontalLineTo(14.5152f)
                curveTo(14.3009f, 8.239f, 14.1041f, 8.239f, 13.9387f, 8.2503f)
                curveTo(13.7611f, 8.2624f, 13.5658f, 8.29f, 13.3673f, 8.3722f)
                curveTo(12.9385f, 8.5498f, 12.5978f, 8.8905f, 12.4202f, 9.3193f)
                curveTo(12.3379f, 9.5178f, 12.3103f, 9.7132f, 12.2982f, 9.8908f)
                curveTo(12.2869f, 10.0561f, 12.2869f, 10.253f, 12.287f, 10.4672f)
                verticalLineTo(15.5108f)
                curveTo(12.2869f, 15.725f, 12.2869f, 15.9219f, 12.2982f, 16.0872f)
                curveTo(12.3103f, 16.2649f, 12.3379f, 16.4602f, 12.4202f, 16.6587f)
                curveTo(12.5978f, 17.0875f, 12.9385f, 17.4282f, 13.3673f, 17.6058f)
                curveTo(13.5658f, 17.688f, 13.7611f, 17.7156f, 13.9387f, 17.7277f)
                curveTo(14.1041f, 17.739f, 14.3009f, 17.739f, 14.5152f, 17.739f)
                horizontalLineTo(14.5587f)
                curveTo(14.773f, 17.739f, 14.9698f, 17.739f, 15.1352f, 17.7277f)
                curveTo(15.3128f, 17.7156f, 15.5082f, 17.688f, 15.7067f, 17.6058f)
                curveTo(16.1355f, 17.4282f, 16.4761f, 17.0875f, 16.6537f, 16.6587f)
                curveTo(16.736f, 16.4602f, 16.7636f, 16.2649f, 16.7757f, 16.0872f)
                curveTo(16.787f, 15.9219f, 16.787f, 15.725f, 16.787f, 15.5108f)
                verticalLineTo(10.4672f)
                curveTo(16.787f, 10.253f, 16.787f, 10.0561f, 16.7757f, 9.8908f)
                curveTo(16.7636f, 9.7132f, 16.736f, 9.5178f, 16.6537f, 9.3193f)
                curveTo(16.4761f, 8.8905f, 16.1355f, 8.5498f, 15.7067f, 8.3722f)
                curveTo(15.5082f, 8.29f, 15.3128f, 8.2624f, 15.1352f, 8.2503f)
                curveTo(14.9698f, 8.239f, 14.773f, 8.239f, 14.5587f, 8.239f)
                close()
                moveTo(13.9383f, 9.7593f)
                curveTo(13.8794f, 9.7846f, 13.8325f, 9.8315f, 13.8073f, 9.8903f)
                curveTo(13.8054f, 9.8977f, 13.7993f, 9.9261f, 13.7947f, 9.9929f)
                curveTo(13.7874f, 10.1009f, 13.787f, 10.2458f, 13.787f, 10.489f)
                verticalLineTo(15.489f)
                curveTo(13.787f, 15.7322f, 13.7874f, 15.8771f, 13.7947f, 15.9851f)
                curveTo(13.7993f, 16.0519f, 13.8054f, 16.0803f, 13.8073f, 16.0877f)
                curveTo(13.8325f, 16.1465f, 13.8794f, 16.1934f, 13.9383f, 16.2187f)
                curveTo(13.9456f, 16.2206f, 13.974f, 16.2267f, 14.0409f, 16.2312f)
                curveTo(14.1489f, 16.2386f, 14.2937f, 16.239f, 14.537f, 16.239f)
                curveTo(14.7802f, 16.239f, 14.9251f, 16.2386f, 15.0331f, 16.2312f)
                curveTo(15.0999f, 16.2267f, 15.1283f, 16.2206f, 15.1357f, 16.2187f)
                curveTo(15.1945f, 16.1934f, 15.2414f, 16.1465f, 15.2667f, 16.0877f)
                curveTo(15.2685f, 16.0803f, 15.2746f, 16.0519f, 15.2792f, 15.9851f)
                curveTo(15.2866f, 15.8771f, 15.287f, 15.7322f, 15.287f, 15.489f)
                verticalLineTo(10.489f)
                curveTo(15.287f, 10.2458f, 15.2866f, 10.1009f, 15.2792f, 9.9929f)
                curveTo(15.2746f, 9.9261f, 15.2685f, 9.8977f, 15.2667f, 9.8903f)
                curveTo(15.2414f, 9.8315f, 15.1945f, 9.7846f, 15.1356f, 9.7593f)
                curveTo(15.1283f, 9.7574f, 15.0999f, 9.7513f, 15.0331f, 9.7468f)
                curveTo(14.9251f, 9.7394f, 14.7802f, 9.739f, 14.537f, 9.739f)
                curveTo(14.2937f, 9.739f, 14.1489f, 9.7394f, 14.0409f, 9.7468f)
                curveTo(13.974f, 9.7513f, 13.9456f, 9.7574f, 13.9383f, 9.7593f)
                close()
            }
        }
            .build()
        return _alarmPause!!
    }

private var _alarmPause: ImageVector? = null

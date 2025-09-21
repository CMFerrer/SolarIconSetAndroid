package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album = Builder(
            name = "Album", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.6994f, 1.25f)
                curveTo(8.7131f, 1.25f, 8.727f, 1.25f, 8.7411f, 1.25f)
                horizontalLineTo(15.2588f)
                curveTo(15.2729f, 1.25f, 15.2868f, 1.25f, 15.3005f, 1.25f)
                curveTo(15.5203f, 1.25f, 15.6889f, 1.2499f, 15.8362f, 1.2657f)
                curveTo(17.1904f, 1.411f, 18.2269f, 2.5231f, 18.2898f, 3.8701f)
                curveTo(19.5325f, 4.2411f, 20.4025f, 5.4249f, 20.3417f, 6.7573f)
                curveTo(20.7402f, 6.937f, 21.093f, 7.185f, 21.3949f, 7.5298f)
                curveTo(22.0113f, 8.2338f, 22.1995f, 9.0954f, 22.2067f, 10.1006f)
                curveTo(22.2137f, 11.0723f, 22.0498f, 12.3015f, 21.8455f, 13.8337f)
                lineTo(21.431f, 16.9422f)
                curveTo(21.2713f, 18.1401f, 21.1421f, 19.1096f, 20.9411f, 19.8688f)
                curveTo(20.7319f, 20.659f, 20.4231f, 21.3141f, 19.8437f, 21.8215f)
                curveTo(19.2642f, 22.3288f, 18.574f, 22.5483f, 17.7631f, 22.6512f)
                curveTo(16.984f, 22.75f, 16.0059f, 22.75f, 14.7975f, 22.75f)
                horizontalLineTo(9.2026f)
                curveTo(7.9941f, 22.75f, 7.016f, 22.75f, 6.2369f, 22.6512f)
                curveTo(5.426f, 22.5483f, 4.7358f, 22.3288f, 4.1563f, 21.8215f)
                curveTo(3.5769f, 21.3141f, 3.2681f, 20.659f, 3.0589f, 19.8688f)
                curveTo(2.8579f, 19.1096f, 2.7287f, 18.1401f, 2.569f, 16.9422f)
                lineTo(2.1545f, 13.8337f)
                curveTo(1.9502f, 12.3015f, 1.7863f, 11.0723f, 1.7933f, 10.1006f)
                curveTo(1.8005f, 9.0954f, 1.9887f, 8.2338f, 2.6051f, 7.5298f)
                curveTo(2.907f, 7.185f, 3.2599f, 6.937f, 3.6583f, 6.7573f)
                curveTo(3.5976f, 5.4249f, 4.4675f, 4.2412f, 5.7101f, 3.8701f)
                curveTo(5.773f, 2.5231f, 6.8095f, 1.411f, 8.1637f, 1.2657f)
                curveTo(8.311f, 1.2499f, 8.4796f, 1.25f, 8.6994f, 1.25f)
                close()
                moveTo(7.2322f, 3.75f)
                horizontalLineTo(16.7677f)
                curveTo(16.6612f, 3.2263f, 16.2264f, 2.8162f, 15.6762f, 2.7571f)
                curveTo(15.6199f, 2.7511f, 15.5397f, 2.75f, 15.2588f, 2.75f)
                horizontalLineTo(8.7411f)
                curveTo(8.4602f, 2.75f, 8.38f, 2.7511f, 8.3237f, 2.7571f)
                curveTo(7.7735f, 2.8162f, 7.3387f, 3.2263f, 7.2322f, 3.75f)
                close()
                moveTo(5.1809f, 6.3674f)
                curveTo(6.1233f, 6.25f, 7.3197f, 6.25f, 8.7942f, 6.25f)
                horizontalLineTo(15.2058f)
                curveTo(16.6803f, 6.25f, 17.8768f, 6.25f, 18.8191f, 6.3674f)
                curveTo(18.697f, 5.7407f, 18.1453f, 5.25f, 17.4619f, 5.25f)
                horizontalLineTo(6.5381f)
                curveTo(5.8547f, 5.25f, 5.303f, 5.7407f, 5.1809f, 6.3674f)
                close()
                moveTo(5.255f, 7.8707f)
                curveTo(4.4306f, 7.9866f, 4.0137f, 8.1981f, 3.7337f, 8.5179f)
                curveTo(3.4537f, 8.8377f, 3.2992f, 9.2789f, 3.2932f, 10.1114f)
                curveTo(3.2871f, 10.9652f, 3.4353f, 12.0897f, 3.6492f, 13.6939f)
                lineTo(3.7059f, 14.1192f)
                lineTo(4.1273f, 13.814f)
                curveTo(5.2148f, 13.0264f, 6.8215f, 13.0652f, 7.8557f, 13.9212f)
                lineTo(11.6939f, 17.0981f)
                curveTo(12.0566f, 17.3983f, 12.6817f, 17.4544f, 13.1328f, 17.192f)
                lineTo(13.3996f, 17.0368f)
                curveTo(14.6758f, 16.2944f, 16.3863f, 16.3727f, 17.5638f, 17.25f)
                lineTo(19.6414f, 18.7976f)
                curveTo(19.7438f, 18.2419f, 19.8356f, 17.5586f, 19.9509f, 16.6939f)
                lineTo(20.3509f, 13.6939f)
                curveTo(20.5648f, 12.0897f, 20.7129f, 10.9652f, 20.7068f, 10.1114f)
                curveTo(20.7008f, 9.2789f, 20.5463f, 8.8377f, 20.2663f, 8.5179f)
                curveTo(19.9864f, 8.1981f, 19.5694f, 7.9866f, 18.745f, 7.8707f)
                curveTo(17.8995f, 7.7518f, 16.7653f, 7.75f, 15.1469f, 7.75f)
                horizontalLineTo(8.8531f)
                curveTo(7.2347f, 7.75f, 6.1005f, 7.7518f, 5.255f, 7.8707f)
                close()
                moveTo(19.1678f, 20.3153f)
                lineTo(16.6677f, 18.4529f)
                curveTo(15.9851f, 17.9444f, 14.9253f, 17.8847f, 14.1539f, 18.3334f)
                lineTo(13.8871f, 18.4886f)
                curveTo(12.9153f, 19.0539f, 11.6045f, 18.9712f, 10.7375f, 18.2536f)
                lineTo(6.8993f, 15.0767f)
                curveTo(6.4013f, 14.6645f, 5.5504f, 14.6355f, 5.0071f, 15.0289f)
                lineTo(3.9311f, 15.8082f)
                lineTo(4.0492f, 16.6939f)
                curveTo(4.2172f, 17.9538f, 4.3352f, 18.8285f, 4.509f, 19.4849f)
                curveTo(4.6773f, 20.1209f, 4.8754f, 20.4574f, 5.1444f, 20.6929f)
                curveTo(5.4134f, 20.9284f, 5.7732f, 21.0803f, 6.4258f, 21.1631f)
                curveTo(7.0994f, 21.2486f, 7.982f, 21.25f, 9.2531f, 21.25f)
                horizontalLineTo(14.7469f)
                curveTo(16.018f, 21.25f, 16.9006f, 21.2486f, 17.5743f, 21.1631f)
                curveTo(18.2269f, 21.0803f, 18.5866f, 20.9284f, 18.8556f, 20.6929f)
                curveTo(18.9718f, 20.5912f, 19.0747f, 20.4706f, 19.1678f, 20.3153f)
                close()
                moveTo(16.5f, 10.75f)
                curveTo(16.0858f, 10.75f, 15.75f, 11.0858f, 15.75f, 11.5f)
                curveTo(15.75f, 11.9142f, 16.0858f, 12.25f, 16.5f, 12.25f)
                curveTo(16.9142f, 12.25f, 17.25f, 11.9142f, 17.25f, 11.5f)
                curveTo(17.25f, 11.0858f, 16.9142f, 10.75f, 16.5f, 10.75f)
                close()
                moveTo(14.25f, 11.5f)
                curveTo(14.25f, 10.2574f, 15.2574f, 9.25f, 16.5f, 9.25f)
                curveTo(17.7427f, 9.25f, 18.75f, 10.2574f, 18.75f, 11.5f)
                curveTo(18.75f, 12.7427f, 17.7427f, 13.75f, 16.5f, 13.75f)
                curveTo(15.2574f, 13.75f, 14.25f, 12.7427f, 14.25f, 11.5f)
                close()
            }
        }
            .build()
        return _album!!
    }

private var _album: ImageVector? = null

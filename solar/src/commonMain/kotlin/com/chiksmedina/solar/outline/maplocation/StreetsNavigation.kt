package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.StreetsNavigation: ImageVector
    get() {
        if (_streetsNavigation != null) {
            return _streetsNavigation!!
        }
        _streetsNavigation = Builder(
            name = "StreetsNavigation", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.4511f, 1.25f)
                horizontalLineTo(14.5489f)
                curveTo(16.1512f, 1.25f, 17.4205f, 1.25f, 18.4248f, 1.3687f)
                curveTo(19.4557f, 1.4905f, 20.3044f, 1.7464f, 21.0134f, 2.3282f)
                curveTo(21.2539f, 2.5256f, 21.4744f, 2.7461f, 21.6718f, 2.9866f)
                curveTo(22.2536f, 3.6956f, 22.5095f, 4.5443f, 22.6313f, 5.5753f)
                curveTo(22.75f, 6.5795f, 22.75f, 7.8488f, 22.75f, 9.451f)
                verticalLineTo(9.549f)
                curveTo(22.75f, 11.1512f, 22.75f, 12.4205f, 22.6313f, 13.4248f)
                curveTo(22.5095f, 14.4557f, 22.2536f, 15.3044f, 21.6718f, 16.0134f)
                curveTo(21.4744f, 16.2539f, 21.2539f, 16.4744f, 21.0134f, 16.6718f)
                curveTo(20.2244f, 17.3193f, 19.2612f, 17.5637f, 18.0651f, 17.668f)
                curveTo(17.6525f, 17.704f, 17.2888f, 17.3986f, 17.2528f, 16.986f)
                curveTo(17.2169f, 16.5733f, 17.5222f, 16.2097f, 17.9349f, 16.1737f)
                curveTo(18.7105f, 16.106f, 19.2391f, 15.9823f, 19.6393f, 15.7841f)
                lineTo(13.5532f, 11.1026f)
                lineTo(3.5009f, 3.9223f)
                curveTo(3.4965f, 3.9276f, 3.4921f, 3.9329f, 3.4877f, 3.9382f)
                curveTo(3.1616f, 4.3356f, 2.9634f, 4.862f, 2.8583f, 5.7513f)
                curveTo(2.7512f, 6.6572f, 2.75f, 7.8379f, 2.75f, 9.5f)
                curveTo(2.75f, 11.1621f, 2.7512f, 12.3428f, 2.8583f, 13.2487f)
                curveTo(2.9634f, 14.138f, 3.1616f, 14.6644f, 3.4877f, 15.0618f)
                curveTo(3.6228f, 15.2263f, 3.7737f, 15.3772f, 3.9382f, 15.5123f)
                curveTo(4.3808f, 15.8755f, 4.9822f, 16.0793f, 6.0651f, 16.1737f)
                curveTo(6.4778f, 16.2097f, 6.7832f, 16.5733f, 6.7472f, 16.986f)
                curveTo(6.7112f, 17.3986f, 6.3475f, 17.704f, 5.9349f, 17.668f)
                curveTo(4.7388f, 17.5637f, 3.7756f, 17.3193f, 2.9866f, 16.6718f)
                curveTo(2.7461f, 16.4744f, 2.5256f, 16.2539f, 2.3282f, 16.0134f)
                curveTo(1.7464f, 15.3044f, 1.4905f, 14.4557f, 1.3687f, 13.4248f)
                curveTo(1.25f, 12.4205f, 1.25f, 11.1512f, 1.25f, 9.5489f)
                verticalLineTo(9.4511f)
                curveTo(1.25f, 7.8488f, 1.25f, 6.5795f, 1.3687f, 5.5753f)
                curveTo(1.4905f, 4.5443f, 1.7464f, 3.6956f, 2.3282f, 2.9866f)
                curveTo(2.5256f, 2.7461f, 2.7461f, 2.5256f, 2.9866f, 2.3282f)
                curveTo(3.6956f, 1.7464f, 4.5443f, 1.4905f, 5.5753f, 1.3687f)
                curveTo(6.5795f, 1.25f, 7.8488f, 1.25f, 9.4511f, 1.25f)
                close()
                moveTo(4.8369f, 3.0332f)
                lineTo(13.8992f, 9.5063f)
                lineTo(19.7076f, 3.2511f)
                curveTo(19.3541f, 3.0615f, 18.8982f, 2.9351f, 18.2487f, 2.8583f)
                curveTo(17.3428f, 2.7512f, 16.1621f, 2.75f, 14.5f, 2.75f)
                horizontalLineTo(9.5f)
                curveTo(7.8379f, 2.75f, 6.6572f, 2.7512f, 5.7513f, 2.8583f)
                curveTo(5.3926f, 2.9007f, 5.0929f, 2.9583f, 4.8369f, 3.0332f)
                close()
                moveTo(20.7629f, 4.319f)
                lineTo(15.1096f, 10.4073f)
                lineTo(20.7344f, 14.7341f)
                curveTo(20.9321f, 14.377f, 21.063f, 13.9146f, 21.1417f, 13.2487f)
                curveTo(21.2488f, 12.3428f, 21.25f, 11.1621f, 21.25f, 9.5f)
                curveTo(21.25f, 7.8379f, 21.2488f, 6.6572f, 21.1417f, 5.7513f)
                curveTo(21.0668f, 5.118f, 20.9448f, 4.6687f, 20.7629f, 4.319f)
                close()
                moveTo(11.973f, 14.767f)
                curveTo(11.9235f, 14.8026f, 11.8386f, 14.8843f, 11.7149f, 15.0616f)
                curveTo(11.4598f, 15.4271f, 11.1718f, 15.9988f, 10.7389f, 16.8648f)
                lineTo(9.4036f, 19.536f)
                curveTo(9.1424f, 20.0584f, 8.9649f, 20.4144f, 8.8543f, 20.6806f)
                curveTo(8.7671f, 20.8906f, 8.7537f, 20.9739f, 8.7508f, 20.9853f)
                curveTo(8.7731f, 21.1146f, 8.8699f, 21.2185f, 8.9971f, 21.2499f)
                curveTo(9.0087f, 21.2478f, 9.0928f, 21.2403f, 9.3082f, 21.1682f)
                curveTo(9.5815f, 21.0767f, 9.9491f, 20.9249f, 10.4886f, 20.7014f)
                curveTo(10.5074f, 20.6936f, 10.5259f, 20.6859f, 10.5442f, 20.6783f)
                curveTo(10.8815f, 20.5384f, 11.1396f, 20.4314f, 11.4111f, 20.3753f)
                curveTo(11.7996f, 20.295f, 12.2004f, 20.295f, 12.5889f, 20.3753f)
                curveTo(12.8604f, 20.4314f, 13.1185f, 20.5384f, 13.4558f, 20.6783f)
                curveTo(13.4741f, 20.6859f, 13.4926f, 20.6936f, 13.5114f, 20.7014f)
                curveTo(14.0509f, 20.9249f, 14.4185f, 21.0767f, 14.6918f, 21.1682f)
                curveTo(14.9072f, 21.2403f, 14.9913f, 21.2478f, 15.0029f, 21.2499f)
                curveTo(15.1301f, 21.2185f, 15.2269f, 21.1146f, 15.2491f, 20.9853f)
                curveTo(15.2462f, 20.9739f, 15.2329f, 20.8906f, 15.1457f, 20.6806f)
                curveTo(15.0351f, 20.4144f, 14.8576f, 20.0584f, 14.5964f, 19.536f)
                lineTo(13.2611f, 16.8648f)
                curveTo(12.8282f, 15.9988f, 12.5402f, 15.4271f, 12.2851f, 15.0616f)
                curveTo(12.1614f, 14.8843f, 12.0765f, 14.8026f, 12.027f, 14.767f)
                curveTo(12.013f, 14.7569f, 12.0041f, 14.7522f, 12.0f, 14.7503f)
                curveTo(11.9959f, 14.7522f, 11.987f, 14.7569f, 11.973f, 14.767f)
                close()
                moveTo(12.0f, 14.7503f)
                curveTo(11.9993f, 14.7502f, 11.9984f, 14.7495f, 11.9974f, 14.7492f)
                curveTo(11.997f, 14.749f, 11.9984f, 14.7496f, 12.0f, 14.7503f)
                curveTo(11.9991f, 14.7503f, 11.9997f, 14.7503f, 12.0f, 14.7503f)
                close()
                moveTo(10.4848f, 14.2032f)
                curveTo(10.8149f, 13.7301f, 11.2827f, 13.25f, 12.0f, 13.25f)
                curveTo(12.7173f, 13.25f, 13.1851f, 13.7301f, 13.5152f, 14.2032f)
                curveTo(13.841f, 14.6701f, 14.1773f, 15.3429f, 14.5754f, 16.1393f)
                lineTo(15.9513f, 18.8915f)
                curveTo(16.196f, 19.3812f, 16.3976f, 19.7844f, 16.5309f, 20.1051f)
                curveTo(16.6557f, 20.4056f, 16.7858f, 20.7756f, 16.7407f, 21.1488f)
                curveTo(16.6454f, 21.9377f, 16.052f, 22.575f, 15.2717f, 22.7261f)
                curveTo(14.9027f, 22.7975f, 14.5244f, 22.694f, 14.2158f, 22.5907f)
                curveTo(13.8865f, 22.4805f, 13.47f, 22.3079f, 12.9642f, 22.0983f)
                lineTo(12.9373f, 22.0872f)
                curveTo(12.5198f, 21.9142f, 12.3999f, 21.8679f, 12.2853f, 21.8442f)
                curveTo(12.0971f, 21.8053f, 11.9029f, 21.8053f, 11.7147f, 21.8442f)
                curveTo(11.6001f, 21.8679f, 11.4802f, 21.9142f, 11.0627f, 22.0872f)
                lineTo(11.0357f, 22.0984f)
                curveTo(10.53f, 22.3079f, 10.1135f, 22.4805f, 9.7843f, 22.5907f)
                curveTo(9.4756f, 22.694f, 9.0973f, 22.7975f, 8.7283f, 22.7261f)
                curveTo(7.9481f, 22.575f, 7.3546f, 21.9377f, 7.2593f, 21.1488f)
                curveTo(7.2142f, 20.7756f, 7.3443f, 20.4056f, 7.4692f, 20.1051f)
                curveTo(7.6024f, 19.7844f, 7.804f, 19.3811f, 8.0488f, 18.8915f)
                lineTo(9.4246f, 16.1393f)
                curveTo(9.8227f, 15.3429f, 10.159f, 14.6701f, 10.4848f, 14.2032f)
                close()
            }
        }
            .build()
        return _streetsNavigation!!
    }

private var _streetsNavigation: ImageVector? = null

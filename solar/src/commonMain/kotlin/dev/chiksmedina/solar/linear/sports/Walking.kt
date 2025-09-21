package dev.chiksmedina.solar.linear.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.SportsGroup

val SportsGroup.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(
            name = "Walking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5f, 4.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.3413f, 11.5869f)
                lineTo(11.0876f, 11.6615f)
                lineTo(11.0876f, 11.6615f)
                lineTo(10.3413f, 11.5869f)
                close()
                moveTo(11.8255f, 17.904f)
                lineTo(11.1906f, 18.3031f)
                lineTo(11.1906f, 18.3031f)
                lineTo(11.8255f, 17.904f)
                close()
                moveTo(13.7654f, 22.3992f)
                curveTo(13.9859f, 22.7498f, 14.4489f, 22.8554f, 14.7995f, 22.635f)
                curveTo(15.1502f, 22.4145f, 15.2558f, 21.9515f, 15.0354f, 21.6008f)
                lineTo(13.7654f, 22.3992f)
                close()
                moveTo(6.3039f, 13.1323f)
                lineTo(7.0361f, 13.295f)
                lineTo(7.0361f, 13.295f)
                lineTo(6.3039f, 13.1323f)
                close()
                moveTo(5.2679f, 14.3373f)
                curveTo(5.178f, 14.7417f, 5.433f, 15.1423f, 5.8373f, 15.2321f)
                curveTo(6.2417f, 15.322f, 6.6423f, 15.067f, 6.7321f, 14.6627f)
                lineTo(5.2679f, 14.3373f)
                close()
                moveTo(17.2702f, 13.2433f)
                lineTo(17.033f, 12.5318f)
                lineTo(17.033f, 12.5318f)
                lineTo(17.2702f, 13.2433f)
                close()
                moveTo(18.2372f, 13.7115f)
                curveTo(18.6301f, 13.5805f, 18.8425f, 13.1558f, 18.7115f, 12.7628f)
                curveTo(18.5805f, 12.3699f, 18.1558f, 12.1575f, 17.7628f, 12.2885f)
                lineTo(18.2372f, 13.7115f)
                close()
                moveTo(12.5815f, 10.0051f)
                lineTo(12.5278f, 10.7532f)
                lineTo(12.5278f, 10.7532f)
                lineTo(12.5815f, 10.0051f)
                close()
                moveTo(14.4196f, 11.6785f)
                lineTo(13.692f, 11.8604f)
                lineTo(13.692f, 11.8604f)
                lineTo(14.4196f, 11.6785f)
                close()
                moveTo(14.3391f, 11.3774f)
                lineTo(13.6263f, 11.6109f)
                lineTo(13.6263f, 11.6109f)
                lineTo(14.3391f, 11.3774f)
                close()
                moveTo(7.3529f, 10.4399f)
                lineTo(7.8222f, 11.0249f)
                lineTo(7.8222f, 11.0249f)
                lineTo(7.3529f, 10.4399f)
                close()
                moveTo(14.5269f, 12.0752f)
                lineTo(15.2355f, 11.8294f)
                lineTo(15.2355f, 11.8293f)
                lineTo(14.5269f, 12.0752f)
                close()
                moveTo(16.8779f, 13.3657f)
                lineTo(16.7049f, 12.6359f)
                lineTo(16.7049f, 12.6359f)
                lineTo(16.8779f, 13.3657f)
                close()
                moveTo(9.7537f, 9.9254f)
                lineTo(9.595f, 11.5123f)
                lineTo(11.0876f, 11.6615f)
                lineTo(11.2463f, 10.0746f)
                lineTo(9.7537f, 9.9254f)
                close()
                moveTo(11.1906f, 18.3031f)
                lineTo(13.7654f, 22.3992f)
                lineTo(15.0354f, 21.6008f)
                lineTo(12.4605f, 17.5048f)
                lineTo(11.1906f, 18.3031f)
                close()
                moveTo(10.5f, 9.25f)
                horizontalLineTo(10.2087f)
                verticalLineTo(10.75f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.25f)
                close()
                moveTo(5.5718f, 12.9696f)
                lineTo(5.2679f, 14.3373f)
                lineTo(6.7321f, 14.6627f)
                lineTo(7.0361f, 13.295f)
                lineTo(5.5718f, 12.9696f)
                close()
                moveTo(10.5f, 10.75f)
                horizontalLineTo(12.2698f)
                verticalLineTo(9.25f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.75f)
                close()
                moveTo(17.5073f, 13.9548f)
                lineTo(18.2372f, 13.7115f)
                lineTo(17.7628f, 12.2885f)
                lineTo(17.033f, 12.5318f)
                lineTo(17.5073f, 13.9548f)
                close()
                moveTo(12.2698f, 10.75f)
                curveTo(12.442f, 10.75f, 12.4897f, 10.7505f, 12.5278f, 10.7532f)
                lineTo(12.6351f, 9.257f)
                curveTo(12.5304f, 9.2495f, 12.4179f, 9.25f, 12.2698f, 9.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(15.1472f, 11.4966f)
                curveTo(15.1113f, 11.3529f, 15.0845f, 11.2437f, 15.0518f, 11.1439f)
                lineTo(13.6263f, 11.6109f)
                curveTo(13.6382f, 11.6472f, 13.6503f, 11.6934f, 13.692f, 11.8604f)
                lineTo(15.1472f, 11.4966f)
                close()
                moveTo(12.5278f, 10.7532f)
                curveTo(13.0342f, 10.7895f, 13.4683f, 11.1284f, 13.6263f, 11.6109f)
                lineTo(15.0518f, 11.1439f)
                curveTo(14.7041f, 10.0826f, 13.7491f, 9.3369f, 12.6351f, 9.257f)
                lineTo(12.5278f, 10.7532f)
                close()
                moveTo(10.2087f, 9.25f)
                curveTo(9.4581f, 9.25f, 8.828f, 9.2487f, 8.3192f, 9.3104f)
                curveTo(7.7902f, 9.3747f, 7.3074f, 9.5149f, 6.8836f, 9.8549f)
                lineTo(7.8222f, 11.0249f)
                curveTo(7.9468f, 10.925f, 8.1227f, 10.8453f, 8.5f, 10.7995f)
                curveTo(8.8975f, 10.7513f, 9.421f, 10.75f, 10.2087f, 10.75f)
                verticalLineTo(9.25f)
                close()
                moveTo(7.0361f, 13.295f)
                curveTo(7.207f, 12.526f, 7.3218f, 12.0153f, 7.4551f, 11.6377f)
                curveTo(7.5816f, 11.2794f, 7.6976f, 11.1249f, 7.8222f, 11.0249f)
                lineTo(6.8836f, 9.8549f)
                curveTo(6.4598f, 10.1948f, 6.2181f, 10.6357f, 6.0407f, 11.1382f)
                curveTo(5.8701f, 11.6215f, 5.7346f, 12.2369f, 5.5718f, 12.9696f)
                lineTo(7.0361f, 13.295f)
                close()
                moveTo(13.692f, 11.8604f)
                curveTo(13.7401f, 12.0527f, 13.7755f, 12.1973f, 13.8184f, 12.321f)
                lineTo(15.2355f, 11.8293f)
                curveTo(15.2201f, 11.7848f, 15.2034f, 11.7211f, 15.1472f, 11.4966f)
                lineTo(13.692f, 11.8604f)
                close()
                moveTo(17.033f, 12.5318f)
                curveTo(16.8135f, 12.6049f, 16.7507f, 12.6251f, 16.7049f, 12.6359f)
                lineTo(17.0509f, 14.0955f)
                curveTo(17.1783f, 14.0653f, 17.3193f, 14.0175f, 17.5073f, 13.9548f)
                lineTo(17.033f, 12.5318f)
                close()
                moveTo(13.8184f, 12.321f)
                curveTo(14.2809f, 13.6543f, 15.6777f, 14.4211f, 17.0509f, 14.0955f)
                lineTo(16.7049f, 12.6359f)
                curveTo(16.0807f, 12.7839f, 15.4458f, 12.4354f, 15.2355f, 11.8294f)
                lineTo(13.8184f, 12.321f)
                close()
                moveTo(9.595f, 11.5123f)
                curveTo(9.4309f, 13.1533f, 9.3224f, 14.1447f, 9.5483f, 15.1061f)
                lineTo(11.0085f, 14.763f)
                curveTo(10.853f, 14.1013f, 10.9135f, 13.4019f, 11.0876f, 11.6615f)
                lineTo(9.595f, 11.5123f)
                close()
                moveTo(12.4605f, 17.5048f)
                curveTo(11.5296f, 16.024f, 11.164f, 15.4248f, 11.0085f, 14.763f)
                lineTo(9.5483f, 15.1061f)
                curveTo(9.7742f, 16.0676f, 10.3128f, 16.9069f, 11.1906f, 18.3031f)
                lineTo(12.4605f, 17.5048f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 17.5f)
                lineTo(6.0f, 22.0f)
            }
        }
            .build()
        return _walking!!
    }

private var _walking: ImageVector? = null

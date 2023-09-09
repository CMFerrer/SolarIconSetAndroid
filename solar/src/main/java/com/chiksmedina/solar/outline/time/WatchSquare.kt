package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

public val TimeGroup.WatchSquare: ImageVector
    get() {
        if (_watchSquare != null) {
            return _watchSquare!!
        }
        _watchSquare = Builder(name = "WatchSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.1637f, 1.25f)
                horizontalLineTo(12.8363f)
                curveTo(13.5671f, 1.25f, 14.1822f, 1.25f, 14.6808f, 1.3104f)
                curveTo(15.2098f, 1.3747f, 15.6926f, 1.5149f, 16.1164f, 1.8549f)
                curveTo(16.5402f, 2.1948f, 16.7819f, 2.6358f, 16.9593f, 3.1382f)
                curveTo(17.1255f, 3.6089f, 17.2583f, 4.2051f, 17.4156f, 4.9128f)
                curveTo(17.4913f, 4.9558f, 17.5657f, 5.0016f, 17.639f, 5.0505f)
                curveTo(18.1576f, 5.3971f, 18.6029f, 5.8424f, 18.9495f, 6.361f)
                curveTo(19.3826f, 7.0093f, 19.5716f, 7.7503f, 19.6619f, 8.6379f)
                curveTo(19.75f, 9.5043f, 19.75f, 10.5892f, 19.75f, 11.9584f)
                verticalLineTo(12.0416f)
                curveTo(19.75f, 13.4108f, 19.75f, 14.4957f, 19.6619f, 15.3621f)
                curveTo(19.5716f, 16.2497f, 19.3826f, 16.9907f, 18.9495f, 17.639f)
                curveTo(18.6029f, 18.1576f, 18.1576f, 18.6029f, 17.639f, 18.9495f)
                curveTo(17.5657f, 18.9984f, 17.4913f, 19.0442f, 17.4157f, 19.0871f)
                curveTo(17.2584f, 19.7949f, 17.1256f, 20.3911f, 16.9594f, 20.8618f)
                curveTo(16.7819f, 21.3643f, 16.5402f, 21.8052f, 16.1165f, 22.1451f)
                curveTo(15.6927f, 22.4851f, 15.2098f, 22.6253f, 14.6808f, 22.6896f)
                curveTo(14.1823f, 22.75f, 13.5671f, 22.75f, 12.8364f, 22.75f)
                horizontalLineTo(11.1637f)
                curveTo(10.433f, 22.75f, 9.8178f, 22.75f, 9.3193f, 22.6896f)
                curveTo(8.7903f, 22.6253f, 8.3074f, 22.4851f, 7.8836f, 22.1451f)
                curveTo(7.4599f, 21.8052f, 7.2182f, 21.3643f, 7.0407f, 20.8618f)
                curveTo(6.8745f, 20.3911f, 6.7417f, 19.7949f, 6.5845f, 19.0872f)
                curveTo(6.5087f, 19.0443f, 6.4343f, 18.9984f, 6.361f, 18.9495f)
                curveTo(5.8424f, 18.6029f, 5.3971f, 18.1576f, 5.0505f, 17.639f)
                curveTo(4.6174f, 16.9907f, 4.4284f, 16.2497f, 4.3381f, 15.3621f)
                curveTo(4.25f, 14.4957f, 4.25f, 13.4108f, 4.25f, 12.0416f)
                verticalLineTo(11.9584f)
                curveTo(4.25f, 10.5892f, 4.25f, 9.5043f, 4.3381f, 8.6379f)
                curveTo(4.4284f, 7.7503f, 4.6174f, 7.0093f, 5.0505f, 6.361f)
                curveTo(5.3971f, 5.8424f, 5.8424f, 5.3971f, 6.361f, 5.0505f)
                curveTo(6.4343f, 5.0016f, 6.5087f, 4.9558f, 6.5844f, 4.9128f)
                curveTo(6.7417f, 4.2051f, 6.8745f, 3.6089f, 7.0407f, 3.1382f)
                curveTo(7.2181f, 2.6358f, 7.4598f, 2.1948f, 7.8836f, 1.8549f)
                curveTo(8.3074f, 1.5149f, 8.7902f, 1.3747f, 9.3192f, 1.3104f)
                curveTo(9.8178f, 1.25f, 10.4329f, 1.25f, 11.1637f, 1.25f)
                close()
                moveTo(8.2433f, 4.3866f)
                curveTo(8.3716f, 4.3678f, 8.5031f, 4.3518f, 8.6379f, 4.3381f)
                curveTo(9.5043f, 4.25f, 10.5892f, 4.25f, 11.9584f, 4.25f)
                horizontalLineTo(12.0416f)
                curveTo(13.4108f, 4.25f, 14.4957f, 4.25f, 15.3621f, 4.3381f)
                curveTo(15.4969f, 4.3518f, 15.6284f, 4.3678f, 15.7567f, 4.3866f)
                curveTo(15.6837f, 4.0849f, 15.617f, 3.8418f, 15.5449f, 3.6377f)
                curveTo(15.4184f, 3.2794f, 15.3024f, 3.1249f, 15.1778f, 3.025f)
                curveTo(15.0532f, 2.925f, 14.8773f, 2.8453f, 14.5001f, 2.7995f)
                curveTo(14.1025f, 2.7513f, 13.579f, 2.75f, 12.7913f, 2.75f)
                horizontalLineTo(11.2087f)
                curveTo(10.421f, 2.75f, 9.8975f, 2.7513f, 9.5f, 2.7995f)
                curveTo(9.1227f, 2.8453f, 8.9468f, 2.925f, 8.8222f, 3.025f)
                curveTo(8.6976f, 3.1249f, 8.5816f, 3.2794f, 8.4551f, 3.6377f)
                curveTo(8.383f, 3.8418f, 8.3163f, 4.0849f, 8.2433f, 4.3866f)
                close()
                moveTo(8.2434f, 19.6134f)
                curveTo(8.3164f, 19.9151f, 8.3831f, 20.1582f, 8.4552f, 20.3623f)
                curveTo(8.5817f, 20.7206f, 8.6976f, 20.8751f, 8.8222f, 20.9751f)
                curveTo(8.9469f, 21.075f, 9.1228f, 21.1547f, 9.5f, 21.2005f)
                curveTo(9.8975f, 21.2487f, 10.421f, 21.25f, 11.2087f, 21.25f)
                horizontalLineTo(12.7914f)
                curveTo(13.5791f, 21.25f, 14.1026f, 21.2487f, 14.5001f, 21.2005f)
                curveTo(14.8773f, 21.1547f, 15.0533f, 21.075f, 15.1779f, 20.9751f)
                curveTo(15.3025f, 20.8751f, 15.4184f, 20.7206f, 15.545f, 20.3623f)
                curveTo(15.617f, 20.1582f, 15.6837f, 19.9151f, 15.7568f, 19.6134f)
                curveTo(15.6284f, 19.6322f, 15.4969f, 19.6482f, 15.3621f, 19.6619f)
                curveTo(14.4957f, 19.75f, 13.4108f, 19.75f, 12.0416f, 19.75f)
                horizontalLineTo(11.9584f)
                curveTo(10.5892f, 19.75f, 9.5043f, 19.75f, 8.6379f, 19.6619f)
                curveTo(8.5031f, 19.6482f, 8.3716f, 19.6322f, 8.2434f, 19.6134f)
                close()
                moveTo(8.7898f, 5.8304f)
                curveTo(8.0207f, 5.9086f, 7.5551f, 6.0567f, 7.1944f, 6.2977f)
                curveTo(6.8395f, 6.5348f, 6.5348f, 6.8395f, 6.2977f, 7.1944f)
                curveTo(6.0567f, 7.5551f, 5.9086f, 8.0207f, 5.8304f, 8.7898f)
                curveTo(5.7509f, 9.5713f, 5.75f, 10.5799f, 5.75f, 12.0f)
                curveTo(5.75f, 13.4201f, 5.7509f, 14.4287f, 5.8304f, 15.2102f)
                curveTo(5.9086f, 15.9793f, 6.0567f, 16.4449f, 6.2977f, 16.8056f)
                curveTo(6.5348f, 17.1605f, 6.8395f, 17.4652f, 7.1944f, 17.7023f)
                curveTo(7.5551f, 17.9433f, 8.0207f, 18.0914f, 8.7898f, 18.1696f)
                curveTo(9.5713f, 18.2491f, 10.5799f, 18.25f, 12.0f, 18.25f)
                curveTo(13.4201f, 18.25f, 14.4287f, 18.2491f, 15.2102f, 18.1696f)
                curveTo(15.9793f, 18.0914f, 16.4449f, 17.9433f, 16.8056f, 17.7023f)
                curveTo(17.1605f, 17.4652f, 17.4652f, 17.1605f, 17.7023f, 16.8056f)
                curveTo(17.9433f, 16.4449f, 18.0914f, 15.9793f, 18.1696f, 15.2102f)
                curveTo(18.2491f, 14.4287f, 18.25f, 13.4201f, 18.25f, 12.0f)
                curveTo(18.25f, 10.5799f, 18.2491f, 9.5713f, 18.1696f, 8.7898f)
                curveTo(18.0914f, 8.0207f, 17.9433f, 7.5551f, 17.7023f, 7.1944f)
                curveTo(17.4652f, 6.8395f, 17.1605f, 6.5348f, 16.8056f, 6.2977f)
                curveTo(16.4449f, 6.0567f, 15.9793f, 5.9086f, 15.2102f, 5.8304f)
                curveTo(14.4287f, 5.7509f, 13.4201f, 5.75f, 12.0f, 5.75f)
                curveTo(10.5799f, 5.75f, 9.5713f, 5.7509f, 8.7898f, 5.8304f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(11.7576f)
                lineTo(14.5198f, 13.4594f)
                curveTo(14.8184f, 13.7465f, 14.8277f, 14.2212f, 14.5406f, 14.5198f)
                curveTo(14.2535f, 14.8184f, 13.7787f, 14.8277f, 13.4802f, 14.5406f)
                lineTo(11.8638f, 12.9864f)
                curveTo(11.5611f, 12.6954f, 11.4098f, 12.5499f, 11.3299f, 12.3622f)
                curveTo(11.25f, 12.1745f, 11.25f, 11.9646f, 11.25f, 11.5447f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
            }
        }
        .build()
        return _watchSquare!!
    }

private var _watchSquare: ImageVector? = null

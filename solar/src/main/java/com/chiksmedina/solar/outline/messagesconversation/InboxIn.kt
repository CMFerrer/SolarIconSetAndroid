package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.InboxIn: ImageVector
    get() {
        if (_inboxIn != null) {
            return _inboxIn!!
        }
        _inboxIn = Builder(
            name = "InboxIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(8.1893f)
                lineTo(14.4697f, 6.4697f)
                curveTo(14.7626f, 6.1768f, 15.2374f, 6.1768f, 15.5303f, 6.4697f)
                curveTo(15.8232f, 6.7626f, 15.8232f, 7.2374f, 15.5303f, 7.5303f)
                lineTo(12.5303f, 10.5303f)
                curveTo(12.2374f, 10.8232f, 11.7626f, 10.8232f, 11.4697f, 10.5303f)
                lineTo(8.4697f, 7.5303f)
                curveTo(8.1768f, 7.2374f, 8.1768f, 6.7626f, 8.4697f, 6.4697f)
                curveTo(8.7626f, 6.1768f, 9.2374f, 6.1768f, 9.5303f, 6.4697f)
                lineTo(11.25f, 8.1893f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(16.2536f, 2.0535f)
                curveTo(16.2941f, 1.6413f, 16.6612f, 1.34f, 17.0734f, 1.3806f)
                curveTo(18.7643f, 1.5469f, 20.0677f, 1.936f, 21.0659f, 2.9342f)
                curveTo(21.9607f, 3.829f, 22.366f, 4.9691f, 22.5603f, 6.4138f)
                curveTo(22.75f, 7.8253f, 22.75f, 9.6343f, 22.75f, 11.9427f)
                verticalLineTo(12.0575f)
                curveTo(22.75f, 12.3718f, 22.75f, 12.677f, 22.7495f, 12.9731f)
                curveTo(22.7498f, 12.982f, 22.75f, 12.991f, 22.75f, 13.0f)
                curveTo(22.75f, 13.0099f, 22.7498f, 13.0197f, 22.7494f, 13.0295f)
                curveTo(22.746f, 14.8816f, 22.7225f, 16.3794f, 22.5603f, 17.5864f)
                curveTo(22.366f, 19.0311f, 21.9607f, 20.1711f, 21.0659f, 21.066f)
                curveTo(20.1711f, 21.9608f, 19.031f, 22.3661f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.7501f, 14.3658f, 22.7501f, 12.0574f, 22.7501f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.7501f, 7.8252f, 22.7501f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.3661f, 3.8289f, 21.9608f, 2.9341f, 21.066f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.0311f, 1.4397f, 17.5864f)
                curveTo(1.2775f, 16.3794f, 1.254f, 14.8816f, 1.2506f, 13.0295f)
                curveTo(1.2502f, 13.0197f, 1.25f, 13.0099f, 1.25f, 13.0f)
                curveTo(1.25f, 12.991f, 1.2502f, 12.982f, 1.2505f, 12.9731f)
                curveTo(1.25f, 12.677f, 1.25f, 12.3718f, 1.25f, 12.0575f)
                verticalLineTo(11.9427f)
                curveTo(1.25f, 9.6343f, 1.25f, 7.8253f, 1.4397f, 6.4138f)
                curveTo(1.634f, 4.9691f, 2.0393f, 3.829f, 2.9341f, 2.9342f)
                curveTo(3.9323f, 1.936f, 5.2357f, 1.5469f, 6.9266f, 1.3806f)
                curveTo(7.3388f, 1.34f, 7.7059f, 1.6413f, 7.7464f, 2.0535f)
                curveTo(7.787f, 2.4658f, 7.4856f, 2.8328f, 7.0734f, 2.8733f)
                curveTo(5.514f, 3.0267f, 4.6295f, 3.3601f, 3.9948f, 3.9949f)
                curveTo(3.4251f, 4.5645f, 3.0982f, 5.3353f, 2.9264f, 6.6137f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6219f, 2.75f, 12.0001f)
                curveTo(2.75f, 12.0842f, 2.75f, 12.1675f, 2.75f, 12.25f)
                horizontalLineTo(5.1603f)
                curveTo(5.2056f, 12.25f, 5.2503f, 12.25f, 5.2945f, 12.2499f)
                curveTo(6.067f, 12.2491f, 6.6789f, 12.2485f, 7.2292f, 12.5016f)
                curveTo(7.7796f, 12.7547f, 8.1773f, 13.2197f, 8.6794f, 13.8067f)
                curveTo(8.7082f, 13.8403f, 8.7373f, 13.8743f, 8.7667f, 13.9087f)
                lineTo(9.3722f, 14.6151f)
                curveTo(10.0059f, 15.3544f, 10.1838f, 15.5373f, 10.3975f, 15.6356f)
                curveTo(10.6113f, 15.734f, 10.8659f, 15.75f, 11.8397f, 15.75f)
                horizontalLineTo(12.1603f)
                curveTo(13.1341f, 15.75f, 13.3887f, 15.734f, 13.6025f, 15.6356f)
                curveTo(13.8162f, 15.5373f, 13.9941f, 15.3544f, 14.6278f, 14.6151f)
                lineTo(15.2333f, 13.9087f)
                curveTo(15.2628f, 13.8743f, 15.2918f, 13.8403f, 15.3206f, 13.8067f)
                curveTo(15.8227f, 13.2197f, 16.2204f, 12.7547f, 16.7708f, 12.5016f)
                curveTo(17.3211f, 12.2485f, 17.933f, 12.2491f, 18.7055f, 12.2499f)
                curveTo(18.7497f, 12.25f, 18.7944f, 12.25f, 18.8397f, 12.25f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 12.1675f, 21.25f, 12.0842f, 21.25f, 12.0001f)
                curveTo(21.25f, 9.6219f, 21.2484f, 7.9136f, 21.0736f, 6.6137f)
                curveTo(20.9018f, 5.3353f, 20.5749f, 4.5645f, 20.0052f, 3.9949f)
                curveTo(19.3705f, 3.3601f, 18.486f, 3.0267f, 16.9266f, 2.8733f)
                curveTo(16.5144f, 2.8328f, 16.2131f, 2.4658f, 16.2536f, 2.0535f)
                close()
                moveTo(21.2465f, 13.75f)
                horizontalLineTo(18.8397f)
                curveTo(17.8659f, 13.75f, 17.6113f, 13.766f, 17.3975f, 13.8644f)
                curveTo(17.1838f, 13.9627f, 17.0059f, 14.1456f, 16.3722f, 14.8849f)
                lineTo(15.7667f, 15.5913f)
                curveTo(15.7372f, 15.6257f, 15.7082f, 15.6597f, 15.6794f, 15.6933f)
                curveTo(15.1773f, 16.2803f, 14.7796f, 16.7453f, 14.2292f, 16.9984f)
                curveTo(13.6789f, 17.2515f, 13.067f, 17.2509f, 12.2945f, 17.2501f)
                curveTo(12.2503f, 17.25f, 12.2056f, 17.25f, 12.1603f, 17.25f)
                horizontalLineTo(11.8397f)
                curveTo(11.7944f, 17.25f, 11.7497f, 17.25f, 11.7055f, 17.2501f)
                curveTo(10.933f, 17.2509f, 10.3211f, 17.2515f, 9.7708f, 16.9984f)
                curveTo(9.2204f, 16.7453f, 8.8227f, 16.2803f, 8.3206f, 15.6933f)
                curveTo(8.2918f, 15.6597f, 8.2627f, 15.6257f, 8.2333f, 15.5913f)
                lineTo(7.6278f, 14.8849f)
                curveTo(6.9941f, 14.1456f, 6.8162f, 13.9627f, 6.6024f, 13.8644f)
                curveTo(6.3887f, 13.766f, 6.1341f, 13.75f, 5.1603f, 13.75f)
                horizontalLineTo(2.7535f)
                curveTo(2.7629f, 15.2527f, 2.7978f, 16.4301f, 2.9264f, 17.3865f)
                curveTo(3.0982f, 18.6649f, 3.4251f, 19.4356f, 3.9948f, 20.0053f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0737f)
                curveTo(7.9136f, 21.2485f, 9.6218f, 21.2501f, 12.0f, 21.2501f)
                curveTo(14.3782f, 21.2501f, 16.0864f, 21.2485f, 17.3864f, 21.0737f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0053f)
                curveTo(20.5749f, 19.4356f, 20.9018f, 18.6649f, 21.0736f, 17.3865f)
                curveTo(21.2022f, 16.4301f, 21.2371f, 15.2527f, 21.2465f, 13.75f)
                close()
            }
        }
            .build()
        return _inboxIn!!
    }

private var _inboxIn: ImageVector? = null

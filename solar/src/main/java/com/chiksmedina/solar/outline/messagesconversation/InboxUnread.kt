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

public val MessagesConversationGroup.InboxUnread: ImageVector
    get() {
        if (_inboxUnread != null) {
            return _inboxUnread!!
        }
        _inboxUnread = Builder(name = "InboxUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9426f, 1.25f)
                lineTo(12.0021f, 1.25f)
                curveTo(12.7204f, 1.25f, 13.388f, 1.25f, 14.0064f, 1.2552f)
                curveTo(14.4206f, 1.2587f, 14.7535f, 1.5974f, 14.75f, 2.0116f)
                curveTo(14.7465f, 2.4258f, 14.4078f, 2.7587f, 13.9936f, 2.7552f)
                curveTo(13.3823f, 2.75f, 12.7207f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
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
                curveTo(21.25f, 12.1675f, 21.25f, 12.0842f, 21.25f, 12.0f)
                curveTo(21.25f, 11.2793f, 21.25f, 10.6177f, 21.2448f, 10.0064f)
                curveTo(21.2413f, 9.5922f, 21.5742f, 9.2535f, 21.9884f, 9.25f)
                curveTo(22.4026f, 9.2465f, 22.7412f, 9.5794f, 22.7448f, 9.9936f)
                curveTo(22.75f, 10.6119f, 22.75f, 11.2794f, 22.75f, 11.9977f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 12.3718f, 22.75f, 12.6769f, 22.7495f, 12.9731f)
                curveTo(22.7498f, 12.982f, 22.75f, 12.991f, 22.75f, 13.0f)
                curveTo(22.75f, 13.0099f, 22.7498f, 13.0197f, 22.7494f, 13.0296f)
                curveTo(22.746f, 14.8816f, 22.7225f, 16.3793f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.2775f, 16.3793f, 1.254f, 14.8816f, 1.2506f, 13.0295f)
                curveTo(1.2502f, 13.0197f, 1.25f, 13.0099f, 1.25f, 13.0f)
                curveTo(1.25f, 12.991f, 1.2502f, 12.982f, 1.2505f, 12.9731f)
                curveTo(1.25f, 12.6769f, 1.25f, 12.3718f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(2.7535f, 13.75f)
                curveTo(2.7629f, 15.2526f, 2.7978f, 16.43f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2022f, 16.43f, 21.2371f, 15.2526f, 21.2465f, 13.75f)
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
                close()
                moveTo(19.0f, 2.75f)
                curveTo(17.7574f, 2.75f, 16.75f, 3.7574f, 16.75f, 5.0f)
                curveTo(16.75f, 6.2426f, 17.7574f, 7.25f, 19.0f, 7.25f)
                curveTo(20.2426f, 7.25f, 21.25f, 6.2426f, 21.25f, 5.0f)
                curveTo(21.25f, 3.7574f, 20.2426f, 2.75f, 19.0f, 2.75f)
                close()
                moveTo(15.25f, 5.0f)
                curveTo(15.25f, 2.9289f, 16.9289f, 1.25f, 19.0f, 1.25f)
                curveTo(21.0711f, 1.25f, 22.75f, 2.9289f, 22.75f, 5.0f)
                curveTo(22.75f, 7.0711f, 21.0711f, 8.75f, 19.0f, 8.75f)
                curveTo(16.9289f, 8.75f, 15.25f, 7.0711f, 15.25f, 5.0f)
                close()
            }
        }
        .build()
        return _inboxUnread!!
    }

private var _inboxUnread: ImageVector? = null

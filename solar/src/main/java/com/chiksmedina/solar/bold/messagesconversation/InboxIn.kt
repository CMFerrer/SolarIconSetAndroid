package com.chiksmedina.solar.bold.messagesconversation

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
import com.chiksmedina.solar.bold.MessagesConversationGroup

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
                moveTo(12.0f, 10.75f)
                curveTo(12.1989f, 10.75f, 12.3897f, 10.671f, 12.5303f, 10.5303f)
                lineTo(15.5303f, 7.5303f)
                curveTo(15.8232f, 7.2374f, 15.8232f, 6.7626f, 15.5303f, 6.4697f)
                curveTo(15.2374f, 6.1768f, 14.7626f, 6.1768f, 14.4697f, 6.4697f)
                lineTo(12.75f, 8.1893f)
                verticalLineTo(2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(8.1893f)
                lineTo(9.5303f, 6.4697f)
                curveTo(9.2374f, 6.1768f, 8.7626f, 6.1768f, 8.4697f, 6.4697f)
                curveTo(8.1768f, 6.7626f, 8.1768f, 7.2374f, 8.4697f, 7.5303f)
                lineTo(11.4697f, 10.5303f)
                curveTo(11.6103f, 10.671f, 11.8011f, 10.75f, 12.0f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(21.8063f, 19.2647f, 21.9744f, 17.3219f, 21.9966f, 13.75f)
                horizontalLineTo(18.8397f)
                curveTo(17.8659f, 13.75f, 17.6113f, 13.766f, 17.3975f, 13.8644f)
                curveTo(17.1838f, 13.9627f, 17.0059f, 14.1456f, 16.3722f, 14.8849f)
                lineTo(15.6794f, 15.6933f)
                curveTo(15.1773f, 16.2803f, 14.7796f, 16.7453f, 14.2292f, 16.9984f)
                curveTo(13.6789f, 17.2515f, 13.067f, 17.2509f, 12.2945f, 17.2501f)
                horizontalLineTo(11.7055f)
                curveTo(10.933f, 17.2509f, 10.3211f, 17.2515f, 9.7708f, 16.9984f)
                curveTo(9.2204f, 16.7453f, 8.8227f, 16.2803f, 8.3206f, 15.6933f)
                lineTo(7.6278f, 14.8849f)
                curveTo(6.9941f, 14.1456f, 6.8162f, 13.9627f, 6.6024f, 13.8644f)
                curveTo(6.3887f, 13.766f, 6.1341f, 13.75f, 5.1603f, 13.75f)
                horizontalLineTo(2.0034f)
                curveTo(2.0256f, 17.3219f, 2.1937f, 19.2647f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.3253f, 2.2543f, 17.5056f, 2.0442f, 14.25f, 2.0077f)
                verticalLineTo(4.8781f)
                curveTo(15.0415f, 4.599f, 15.9579f, 4.7759f, 16.591f, 5.409f)
                curveTo(17.4697f, 6.2877f, 17.4697f, 7.7123f, 16.591f, 8.591f)
                lineTo(13.591f, 11.591f)
                curveTo(13.169f, 12.0129f, 12.5967f, 12.25f, 12.0f, 12.25f)
                curveTo(11.4033f, 12.25f, 10.831f, 12.0129f, 10.409f, 11.591f)
                lineTo(7.409f, 8.591f)
                curveTo(6.5303f, 7.7123f, 6.5303f, 6.2877f, 7.409f, 5.409f)
                curveTo(8.0421f, 4.7759f, 8.9585f, 4.599f, 9.75f, 4.8781f)
                verticalLineTo(2.0077f)
                curveTo(6.4944f, 2.0442f, 4.6747f, 2.2543f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                lineTo(2.0f, 12.25f)
                lineTo(5.2945f, 12.2499f)
                curveTo(6.067f, 12.2491f, 6.6789f, 12.2485f, 7.2292f, 12.5016f)
                curveTo(7.7796f, 12.7547f, 8.1773f, 13.2197f, 8.6794f, 13.8067f)
                lineTo(9.3722f, 14.6151f)
                curveTo(10.0059f, 15.3544f, 10.1838f, 15.5373f, 10.3975f, 15.6356f)
                curveTo(10.6113f, 15.734f, 10.8659f, 15.75f, 11.8397f, 15.75f)
                horizontalLineTo(12.1603f)
                curveTo(13.1341f, 15.75f, 13.3887f, 15.734f, 13.6025f, 15.6356f)
                curveTo(13.8162f, 15.5373f, 13.9941f, 15.3544f, 14.6278f, 14.6151f)
                lineTo(15.3206f, 13.8067f)
                curveTo(15.8227f, 13.2197f, 16.2204f, 12.7547f, 16.7708f, 12.5016f)
                curveTo(17.3211f, 12.2485f, 17.933f, 12.2491f, 18.7055f, 12.2499f)
                lineTo(22.0f, 12.25f)
                lineTo(22.0f, 12.0f)
                close()
            }
        }
            .build()
        return _inboxIn!!
    }

private var _inboxIn: ImageVector? = null

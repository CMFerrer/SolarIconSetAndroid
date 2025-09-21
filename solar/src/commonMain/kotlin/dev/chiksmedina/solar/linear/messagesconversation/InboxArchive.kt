package dev.chiksmedina.solar.linear.messagesconversation

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
import dev.chiksmedina.solar.linear.MessagesConversationGroup

val MessagesConversationGroup.InboxArchive: ImageVector
    get() {
        if (_inboxArchive != null) {
            return _inboxArchive!!
        }
        _inboxArchive = Builder(
            name = "InboxArchive", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 15.0f)
                horizontalLineTo(6.3015f)
                curveTo(7.1098f, 15.0f, 7.514f, 15.0f, 7.8768f, 15.1477f)
                curveTo(7.9098f, 15.1612f, 7.9425f, 15.1755f, 7.9747f, 15.1907f)
                curveTo(8.329f, 15.3576f, 8.6027f, 15.6551f, 9.15f, 16.25f)
                lineTo(9.1855f, 16.2885f)
                curveTo(9.6976f, 16.8452f, 9.9537f, 17.1235f, 10.2809f, 17.2877f)
                curveTo(10.3422f, 17.3184f, 10.405f, 17.346f, 10.4692f, 17.3703f)
                curveTo(10.8115f, 17.5f, 11.1897f, 17.5f, 11.9462f, 17.5f)
                curveTo(12.6613f, 17.5f, 13.0189f, 17.5f, 13.3458f, 17.3829f)
                curveTo(13.4071f, 17.361f, 13.4673f, 17.336f, 13.5262f, 17.3082f)
                curveTo(13.8402f, 17.1598f, 14.0931f, 16.9069f, 14.5987f, 16.4013f)
                lineTo(14.8284f, 16.1716f)
                curveTo(15.4065f, 15.5935f, 15.6955f, 15.3045f, 16.0631f, 15.1522f)
                curveTo(16.4306f, 15.0f, 16.8394f, 15.0f, 17.6569f, 15.0f)
                horizontalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 15.0f)
                verticalLineTo(13.5f)
                curveTo(5.0f, 12.6716f, 5.6716f, 12.0f, 6.5f, 12.0f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 12.0f, 19.0f, 12.6716f, 19.0f, 13.5f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 14.0f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 9.6716f, 5.6716f, 9.0f, 6.5f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 9.0f, 19.0f, 9.6716f, 19.0f, 10.5f)
                verticalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 11.0f)
                verticalLineTo(7.5f)
                curveTo(5.0f, 6.6716f, 5.6716f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 6.0f, 19.0f, 6.6716f, 19.0f, 7.5f)
                verticalLineTo(11.0f)
            }
        }
            .build()
        return _inboxArchive!!
    }

private var _inboxArchive: ImageVector? = null

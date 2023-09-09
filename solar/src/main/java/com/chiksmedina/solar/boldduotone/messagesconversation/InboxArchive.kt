package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

public val MessagesConversationGroup.InboxArchive: ImageVector
    get() {
        if (_inboxArchive != null) {
            return _inboxArchive!!
        }
        _inboxArchive = Builder(name = "InboxArchive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.4998f)
                verticalLineTo(7.5f)
                curveTo(5.0f, 6.6716f, 5.6716f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 6.0f, 19.0f, 6.6716f, 19.0f, 7.5f)
                verticalLineTo(8.4998f)
                curveTo(18.5822f, 8.186f, 18.0628f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(6.5f)
                curveTo(5.9372f, 8.0f, 5.4178f, 8.186f, 5.0f, 8.4998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.4998f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 9.6716f, 5.6716f, 9.0f, 6.5f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 9.0f, 19.0f, 9.6716f, 19.0f, 10.5f)
                verticalLineTo(11.4998f)
                curveTo(18.5822f, 11.186f, 18.0628f, 11.0f, 17.5f, 11.0f)
                horizontalLineTo(6.5f)
                curveTo(5.9372f, 11.0f, 5.4178f, 11.186f, 5.0f, 11.4998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.75f, 15.0f)
                curveTo(20.75f, 14.5858f, 20.4142f, 14.25f, 20.0f, 14.25f)
                horizontalLineTo(18.9793f)
                verticalLineTo(13.2503f)
                curveTo(18.8604f, 12.5407f, 18.2434f, 12.0f, 17.5f, 12.0f)
                horizontalLineTo(6.5f)
                curveTo(5.7566f, 12.0f, 5.1396f, 12.5407f, 5.0207f, 13.2503f)
                verticalLineTo(14.25f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 14.25f, 3.25f, 14.5858f, 3.25f, 15.0f)
                curveTo(3.25f, 15.4142f, 3.5858f, 15.75f, 4.0f, 15.75f)
                horizontalLineTo(6.3015f)
                curveTo(7.1704f, 15.75f, 7.3989f, 15.7629f, 7.5939f, 15.8423f)
                curveTo(7.6145f, 15.8507f, 7.6349f, 15.8597f, 7.6551f, 15.8692f)
                curveTo(7.8455f, 15.9589f, 8.0097f, 16.1183f, 8.5981f, 16.7578f)
                lineTo(8.6335f, 16.7963f)
                lineTo(8.7094f, 16.8789f)
                curveTo(9.1465f, 17.3549f, 9.4919f, 17.731f, 9.9446f, 17.9581f)
                curveTo(10.0289f, 18.0004f, 10.1153f, 18.0383f, 10.2035f, 18.0717f)
                curveTo(10.6771f, 18.2511f, 11.1877f, 18.2506f, 11.834f, 18.2501f)
                lineTo(11.9462f, 18.25f)
                lineTo(12.052f, 18.2501f)
                curveTo(12.6634f, 18.2506f, 13.1464f, 18.251f, 13.5987f, 18.089f)
                curveTo(13.683f, 18.0588f, 13.7658f, 18.0245f, 13.8467f, 17.9863f)
                curveTo(14.2811f, 17.781f, 14.6223f, 17.4392f, 15.0543f, 17.0065f)
                lineTo(15.1291f, 16.9316f)
                lineTo(15.3588f, 16.7019f)
                curveTo(15.9801f, 16.0806f, 16.1524f, 15.927f, 16.3501f, 15.8452f)
                curveTo(16.5477f, 15.7633f, 16.7782f, 15.75f, 17.6569f, 15.75f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 15.75f, 20.75f, 15.4142f, 20.75f, 15.0f)
                close()
            }
        }
        .build()
        return _inboxArchive!!
    }

private var _inboxArchive: ImageVector? = null

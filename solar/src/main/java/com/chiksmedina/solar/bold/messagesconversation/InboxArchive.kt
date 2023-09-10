package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MessagesConversationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
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
                moveTo(5.0f, 10.5f)
                verticalLineTo(11.4998f)
                curveTo(5.4178f, 11.186f, 5.9372f, 11.0f, 6.5f, 11.0f)
                horizontalLineTo(17.5f)
                curveTo(18.0628f, 11.0f, 18.5822f, 11.186f, 19.0f, 11.4998f)
                verticalLineTo(10.5f)
                curveTo(19.0f, 9.6716f, 18.3284f, 9.0f, 17.5f, 9.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 9.0f, 5.0f, 9.6716f, 5.0f, 10.5f)
                close()
                moveTo(20.0f, 14.2502f)
                curveTo(20.4142f, 14.2502f, 20.75f, 14.5859f, 20.75f, 15.0002f)
                curveTo(20.75f, 15.4144f, 20.4142f, 15.7502f, 20.0f, 15.7502f)
                horizontalLineTo(17.6569f)
                curveTo(16.7782f, 15.7502f, 16.5477f, 15.7634f, 16.3501f, 15.8453f)
                curveTo(16.1524f, 15.9272f, 15.9801f, 16.0807f, 15.3588f, 16.7021f)
                lineTo(15.0543f, 17.0066f)
                curveTo(14.6223f, 17.4393f, 14.2811f, 17.7811f, 13.8467f, 17.9864f)
                curveTo(13.7658f, 18.0247f, 13.683f, 18.059f, 13.5987f, 18.0892f)
                curveTo(13.1464f, 18.2511f, 12.6634f, 18.2507f, 12.052f, 18.2502f)
                lineTo(11.9462f, 18.2502f)
                lineTo(11.834f, 18.2502f)
                curveTo(11.1877f, 18.2508f, 10.6771f, 18.2512f, 10.2035f, 18.0718f)
                curveTo(10.1153f, 18.0384f, 10.0289f, 18.0005f, 9.9446f, 17.9582f)
                curveTo(9.4919f, 17.7311f, 9.1465f, 17.3551f, 8.7094f, 16.879f)
                lineTo(8.5981f, 16.7579f)
                curveTo(8.0097f, 16.1184f, 7.8455f, 15.9591f, 7.6551f, 15.8694f)
                curveTo(7.6349f, 15.8599f, 7.6145f, 15.8509f, 7.5939f, 15.8425f)
                curveTo(7.3989f, 15.7631f, 7.1704f, 15.7502f, 6.3015f, 15.7502f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 15.7502f, 3.25f, 15.4144f, 3.25f, 15.0002f)
                curveTo(3.25f, 14.5859f, 3.5858f, 14.2502f, 4.0f, 14.2502f)
                lineTo(5.0205f, 14.2501f)
                verticalLineTo(13.2503f)
                curveTo(5.1394f, 12.5407f, 5.7565f, 12.0f, 6.4998f, 12.0f)
                horizontalLineTo(17.4998f)
                curveTo(18.2432f, 12.0f, 18.8603f, 12.5407f, 18.9791f, 13.2503f)
                verticalLineTo(14.2501f)
                lineTo(20.0f, 14.2502f)
                close()
            }
        }
            .build()
        return _inboxArchive!!
    }

private var _inboxArchive: ImageVector? = null

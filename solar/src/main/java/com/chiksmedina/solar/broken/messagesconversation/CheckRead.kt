package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

public val MessagesConversationGroup.CheckRead: ImageVector
    get() {
        if (_checkRead != null) {
            return _checkRead!!
        }
        _checkRead = Builder(name = "CheckRead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.565f, 12.4068f)
                curveTo(4.2926f, 12.0947f, 3.8188f, 12.0626f, 3.5068f, 12.335f)
                curveTo(3.1947f, 12.6074f, 3.1626f, 13.0812f, 3.435f, 13.3932f)
                lineTo(4.565f, 12.4068f)
                close()
                moveTo(7.1429f, 16.5f)
                lineTo(6.5779f, 16.9932f)
                curveTo(6.7203f, 17.1564f, 6.9263f, 17.25f, 7.1429f, 17.25f)
                curveTo(7.3594f, 17.25f, 7.5654f, 17.1564f, 7.7078f, 16.9932f)
                lineTo(7.1429f, 16.5f)
                close()
                moveTo(15.565f, 7.9932f)
                curveTo(15.8374f, 7.6812f, 15.8053f, 7.2074f, 15.4932f, 6.935f)
                curveTo(15.1812f, 6.6626f, 14.7074f, 6.6947f, 14.435f, 7.0068f)
                lineTo(15.565f, 7.9932f)
                close()
                moveTo(10.5064f, 11.5068f)
                curveTo(10.234f, 11.8188f, 10.2662f, 12.2926f, 10.5782f, 12.565f)
                curveTo(10.8902f, 12.8374f, 11.364f, 12.8053f, 11.6364f, 12.4932f)
                lineTo(10.5064f, 11.5068f)
                close()
                moveTo(9.6721f, 14.7432f)
                curveTo(9.9445f, 14.4312f, 9.9124f, 13.9574f, 9.6004f, 13.685f)
                curveTo(9.2884f, 13.4126f, 8.8146f, 13.4447f, 8.5421f, 13.7568f)
                lineTo(9.6721f, 14.7432f)
                close()
                moveTo(3.435f, 13.3932f)
                lineTo(6.5779f, 16.9932f)
                lineTo(7.7078f, 16.0068f)
                lineTo(4.565f, 12.4068f)
                lineTo(3.435f, 13.3932f)
                close()
                moveTo(7.7078f, 16.9932f)
                lineTo(9.6721f, 14.7432f)
                lineTo(8.5421f, 13.7568f)
                lineTo(6.5779f, 16.0068f)
                lineTo(7.7078f, 16.9932f)
                close()
                moveTo(11.6364f, 12.4932f)
                lineTo(13.6007f, 10.2432f)
                lineTo(12.4707f, 9.2568f)
                lineTo(10.5064f, 11.5068f)
                lineTo(11.6364f, 12.4932f)
                close()
                moveTo(13.6007f, 10.2432f)
                lineTo(15.565f, 7.9932f)
                lineTo(14.435f, 7.0068f)
                lineTo(12.4707f, 9.2568f)
                lineTo(13.6007f, 10.2432f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0002f, 7.5625f)
                lineTo(15.7144f, 12.0625f)
                moveTo(11.0002f, 16.0f)
                lineTo(11.4286f, 16.5625f)
                lineTo(13.5715f, 14.3125f)
            }
        }
        .build()
        return _checkRead!!
    }

private var _checkRead: ImageVector? = null

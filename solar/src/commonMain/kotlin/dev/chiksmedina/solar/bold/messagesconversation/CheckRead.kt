package dev.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.CheckRead: ImageVector
    get() {
        if (_checkRead != null) {
            return _checkRead!!
        }
        _checkRead = Builder(
            name = "CheckRead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.4743f, 8.419f)
                curveTo(14.7952f, 8.6809f, 14.8429f, 9.1534f, 14.581f, 9.4743f)
                lineTo(8.8667f, 16.4743f)
                curveTo(8.7243f, 16.6488f, 8.511f, 16.75f, 8.2857f, 16.75f)
                curveTo(8.0605f, 16.75f, 7.8472f, 16.6488f, 7.7047f, 16.4743f)
                lineTo(5.419f, 13.6743f)
                curveTo(5.1571f, 13.3534f, 5.2048f, 12.8809f, 5.5257f, 12.619f)
                curveTo(5.8466f, 12.3571f, 6.3191f, 12.4048f, 6.581f, 12.7257f)
                lineTo(8.2857f, 14.814f)
                lineTo(13.419f, 8.5257f)
                curveTo(13.6809f, 8.2048f, 14.1534f, 8.1571f, 14.4743f, 8.419f)
                close()
                moveTo(18.4743f, 8.419f)
                curveTo(18.7952f, 8.681f, 18.8429f, 9.1534f, 18.581f, 9.4743f)
                lineTo(12.8665f, 16.4743f)
                curveTo(12.7152f, 16.6596f, 12.4846f, 16.7617f, 12.2457f, 16.7489f)
                curveTo(12.0068f, 16.7362f, 11.7883f, 16.6103f, 11.6575f, 16.4099f)
                lineTo(11.3719f, 15.9724f)
                curveTo(11.1455f, 15.6256f, 11.2432f, 15.1608f, 11.5901f, 14.9344f)
                curveTo(11.7939f, 14.8014f, 12.0384f, 14.7803f, 12.2514f, 14.8558f)
                lineTo(17.419f, 8.5257f)
                curveTo(17.681f, 8.2048f, 18.1534f, 8.1571f, 18.4743f, 8.419f)
                close()
            }
        }
            .build()
        return _checkRead!!
    }

private var _checkRead: ImageVector? = null

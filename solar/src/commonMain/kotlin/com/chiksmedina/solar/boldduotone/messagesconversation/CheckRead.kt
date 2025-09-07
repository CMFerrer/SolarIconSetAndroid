package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.581f, 9.4743f)
                curveTo(18.843f, 9.1534f, 18.7952f, 8.681f, 18.4743f, 8.419f)
                curveTo(18.1534f, 8.1571f, 17.681f, 8.2049f, 17.419f, 8.5257f)
                lineTo(12.2514f, 14.8559f)
                curveTo(12.0385f, 14.7803f, 11.7939f, 14.8014f, 11.5901f, 14.9345f)
                curveTo(11.2432f, 15.1609f, 11.1456f, 15.6256f, 11.372f, 15.9724f)
                lineTo(11.6575f, 16.4099f)
                curveTo(11.7883f, 16.6103f, 12.0068f, 16.7362f, 12.2457f, 16.749f)
                curveTo(12.4846f, 16.7617f, 12.7153f, 16.6597f, 12.8666f, 16.4743f)
                lineTo(18.581f, 9.4743f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.581f, 9.4743f)
                curveTo(14.843f, 9.1534f, 14.7952f, 8.681f, 14.4743f, 8.419f)
                curveTo(14.1534f, 8.1571f, 13.681f, 8.2049f, 13.419f, 8.5257f)
                lineTo(8.2857f, 14.814f)
                lineTo(6.581f, 12.7257f)
                curveTo(6.3191f, 12.4049f, 5.8466f, 12.3571f, 5.5257f, 12.619f)
                curveTo(5.2049f, 12.881f, 5.1571f, 13.3534f, 5.419f, 13.6743f)
                lineTo(7.7047f, 16.4743f)
                curveTo(7.8472f, 16.6488f, 8.0605f, 16.75f, 8.2857f, 16.75f)
                curveTo(8.511f, 16.75f, 8.7243f, 16.6488f, 8.8667f, 16.4743f)
                lineTo(14.581f, 9.4743f)
                close()
            }
        }
            .build()
        return _checkRead!!
    }

private var _checkRead: ImageVector? = null

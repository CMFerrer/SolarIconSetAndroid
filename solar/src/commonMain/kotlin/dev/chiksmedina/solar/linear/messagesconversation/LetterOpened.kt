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

val MessagesConversationGroup.LetterOpened: ImageVector
    get() {
        if (_letterOpened != null) {
            return _letterOpened!!
        }
        _letterOpened = Builder(
            name = "LetterOpened", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 6.1016f)
                curveTo(19.3001f, 6.2294f, 20.1752f, 6.5185f, 20.8284f, 7.1716f)
                curveTo(22.0f, 8.3432f, 22.0f, 10.2288f, 22.0f, 14.0001f)
                curveTo(22.0f, 17.7713f, 22.0f, 19.6569f, 20.8284f, 20.8285f)
                curveTo(19.6569f, 22.0001f, 17.7712f, 22.0001f, 14.0f, 22.0001f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0001f, 4.3432f, 22.0001f, 3.1716f, 20.8285f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7713f, 2.0f, 14.0001f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(3.8247f, 6.5185f, 4.6999f, 6.2294f, 6.0f, 6.1016f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.0f)
                horizontalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 9.0f)
                horizontalLineTo(13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.1589f, 11.7991f)
                lineTo(7.4393f, 11.1994f)
                curveTo(6.7315f, 10.6096f, 6.3776f, 10.3147f, 6.1888f, 9.9116f)
                curveTo(6.0f, 9.5084f, 6.0f, 9.0478f, 6.0f, 8.1265f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 4.643f, 6.0f, 3.4645f, 6.7322f, 2.7322f)
                curveTo(7.4645f, 2.0f, 8.643f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(15.357f, 2.0f, 16.5355f, 2.0f, 17.2678f, 2.7322f)
                curveTo(18.0f, 3.4645f, 18.0f, 4.643f, 18.0f, 7.0f)
                verticalLineTo(8.1265f)
                curveTo(18.0f, 9.0478f, 18.0f, 9.5084f, 17.8112f, 9.9116f)
                curveTo(17.6224f, 10.3147f, 17.2685f, 10.6096f, 16.5607f, 11.1994f)
                lineTo(15.8411f, 11.7991f)
                curveTo(14.0045f, 13.3296f, 13.0861f, 14.0949f, 12.0f, 14.0949f)
                curveTo(10.9139f, 14.0949f, 9.9955f, 13.3296f, 8.1589f, 11.7991f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 10.0f)
                lineTo(8.1589f, 11.7991f)
                curveTo(9.9955f, 13.3296f, 10.9139f, 14.0949f, 12.0f, 14.0949f)
                curveTo(13.0861f, 14.0949f, 14.0045f, 13.3296f, 15.8411f, 11.7991f)
                lineTo(18.0f, 10.0f)
            }
        }
            .build()
        return _letterOpened!!
    }

private var _letterOpened: ImageVector? = null

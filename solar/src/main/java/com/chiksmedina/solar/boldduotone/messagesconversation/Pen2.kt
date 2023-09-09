package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MessagesConversationGroup.Pen2: ImageVector
    get() {
        if (_pen2 != null) {
            return _pen2!!
        }
        _pen2 = Builder(name = "Pen2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.25f, 22.0f)
                curveTo(3.25f, 21.5858f, 3.5858f, 21.25f, 4.0f, 21.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 21.25f, 20.75f, 21.5858f, 20.75f, 22.0f)
                curveTo(20.75f, 22.4142f, 20.4142f, 22.75f, 20.0f, 22.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 22.75f, 3.25f, 22.4142f, 3.25f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0807f, 7.3716f)
                curveTo(20.3095f, 6.1428f, 20.3095f, 4.1505f, 19.0807f, 2.9216f)
                curveTo(17.8519f, 1.6928f, 15.8595f, 1.6928f, 14.6307f, 2.9216f)
                lineTo(13.9209f, 3.6314f)
                curveTo(13.9306f, 3.6608f, 13.9407f, 3.6905f, 13.9512f, 3.7207f)
                curveTo(14.2113f, 4.4705f, 14.7022f, 5.4536f, 15.6256f, 6.377f)
                curveTo(16.549f, 7.3004f, 17.532f, 7.7913f, 18.2819f, 8.0514f)
                curveTo(18.3119f, 8.0618f, 18.3415f, 8.0719f, 18.3708f, 8.0815f)
                lineTo(19.0807f, 7.3716f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9511f, 3.5996f)
                lineTo(13.9205f, 3.6302f)
                curveTo(13.9303f, 3.6595f, 13.9403f, 3.6893f, 13.9508f, 3.7194f)
                curveTo(14.211f, 4.4693f, 14.7018f, 5.4523f, 15.6252f, 6.3757f)
                curveTo(16.5487f, 7.2991f, 17.5317f, 7.79f, 18.2816f, 8.0502f)
                curveTo(18.3113f, 8.0605f, 18.3407f, 8.0705f, 18.3696f, 8.0801f)
                lineTo(11.5198f, 14.9299f)
                curveTo(11.058f, 15.3917f, 10.827f, 15.6227f, 10.5724f, 15.8213f)
                curveTo(10.2721f, 16.0555f, 9.9471f, 16.2564f, 9.6033f, 16.4202f)
                curveTo(9.3118f, 16.5591f, 9.002f, 16.6624f, 8.3823f, 16.869f)
                lineTo(5.115f, 17.9581f)
                curveTo(4.8101f, 18.0597f, 4.4739f, 17.9804f, 4.2466f, 17.7531f)
                curveTo(4.0193f, 17.5258f, 3.94f, 17.1897f, 4.0416f, 16.8847f)
                lineTo(5.1307f, 13.6173f)
                curveTo(5.3373f, 12.9977f, 5.4405f, 12.6879f, 5.5795f, 12.3964f)
                curveTo(5.7433f, 12.0526f, 5.9442f, 11.7276f, 6.1784f, 11.4273f)
                curveTo(6.377f, 11.1727f, 6.6079f, 10.9418f, 7.0697f, 10.48f)
                lineTo(13.9511f, 3.5996f)
                close()
            }
        }
        .build()
        return _pen2!!
    }

private var _pen2: ImageVector? = null

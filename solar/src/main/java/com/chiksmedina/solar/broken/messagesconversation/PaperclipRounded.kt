package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

public val MessagesConversationGroup.PaperclipRounded: ImageVector
    get() {
        if (_paperclipRounded != null) {
            return _paperclipRounded!!
        }
        _paperclipRounded = Builder(name = "PaperclipRounded", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.8854f, 15.9496f)
                curveTo(20.3094f, 14.5128f, 21.0214f, 13.7944f, 21.4104f, 13.0241f)
                curveTo(22.1965f, 11.4673f, 22.1965f, 9.6248f, 21.4104f, 8.068f)
                curveTo(21.0214f, 7.2977f, 20.3094f, 6.5793f, 18.8854f, 5.1426f)
                curveTo(17.4615f, 3.7058f, 16.7495f, 2.9874f, 15.9861f, 2.5949f)
                curveTo(14.4431f, 1.8017f, 12.6171f, 1.8017f, 11.0741f, 2.5949f)
                curveTo(10.3107f, 2.9874f, 9.5987f, 3.7058f, 8.1748f, 5.1426f)
                moveTo(15.2132f, 19.6548f)
                curveTo(14.8579f, 20.0133f, 14.6802f, 20.1926f, 14.5115f, 20.3232f)
                curveTo(13.346f, 21.2256f, 11.7251f, 21.2256f, 10.5596f, 20.3232f)
                curveTo(10.3908f, 20.1926f, 10.2132f, 20.0133f, 9.8579f, 19.6548f)
                curveTo(9.5026f, 19.2963f, 9.3249f, 19.1171f, 9.1954f, 18.9468f)
                curveTo(8.3011f, 17.7708f, 8.3011f, 16.1353f, 9.1954f, 14.9594f)
                curveTo(9.3249f, 14.7891f, 9.5026f, 14.6098f, 9.8579f, 14.2513f)
                lineTo(12.6885f, 11.3952f)
                moveTo(4.4451f, 8.9057f)
                curveTo(3.6455f, 9.7126f, 3.2456f, 10.1161f, 2.9716f, 10.5128f)
                curveTo(1.6761f, 12.3882f, 1.6761f, 14.8794f, 2.9716f, 16.7548f)
                curveTo(3.2456f, 17.1515f, 3.6455f, 17.5549f, 4.4451f, 18.3618f)
            }
        }
        .build()
        return _paperclipRounded!!
    }

private var _paperclipRounded: ImageVector? = null

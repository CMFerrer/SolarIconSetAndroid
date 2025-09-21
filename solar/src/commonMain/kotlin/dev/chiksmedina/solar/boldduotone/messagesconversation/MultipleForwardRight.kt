package dev.chiksmedina.solar.boldduotone.messagesconversation

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
import dev.chiksmedina.solar.boldduotone.MessagesConversationGroup

val MessagesConversationGroup.MultipleForwardRight: ImageVector
    get() {
        if (_multipleForwardRight != null) {
            return _multipleForwardRight!!
        }
        _multipleForwardRight = Builder(
            name = "MultipleForwardRight", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.3315f, 5.1834f)
                lineTo(17.3094f, 9.6081f)
                curveTo(18.2399f, 10.4353f, 18.7052f, 10.8489f, 18.8767f, 11.3373f)
                curveTo(19.0273f, 11.7662f, 19.0273f, 12.2335f, 18.8767f, 12.6624f)
                curveTo(18.7052f, 13.1508f, 18.2399f, 13.5644f, 17.3094f, 14.3916f)
                lineTo(12.3315f, 18.8163f)
                curveTo(11.9092f, 19.1917f, 11.6981f, 19.3794f, 11.5187f, 19.3861f)
                curveTo(11.3629f, 19.3919f, 11.2133f, 19.3247f, 11.1142f, 19.2044f)
                curveTo(11.0f, 19.0659f, 11.0f, 18.7834f, 11.0f, 18.2184f)
                verticalLineTo(15.4284f)
                curveTo(8.572f, 15.4284f, 6.0074f, 16.2083f, 4.1348f, 17.5926f)
                curveTo(3.1599f, 18.3133f, 2.6724f, 18.6737f, 2.4868f, 18.6595f)
                curveTo(2.3058f, 18.6456f, 2.1909f, 18.575f, 2.097f, 18.4196f)
                curveTo(2.0007f, 18.2603f, 2.0858f, 17.7624f, 2.2559f, 16.7666f)
                curveTo(3.3609f, 10.3004f, 7.8109f, 8.5713f, 11.0f, 8.5713f)
                verticalLineTo(5.7813f)
                curveTo(11.0f, 5.2163f, 11.0f, 4.9338f, 11.1142f, 4.7953f)
                curveTo(11.2133f, 4.675f, 11.3629f, 4.6078f, 11.5187f, 4.6136f)
                curveTo(11.6981f, 4.6203f, 11.9092f, 4.808f, 12.3315f, 5.1834f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(14.989f, 3.9897f)
                curveTo(15.2708f, 3.6861f, 15.7454f, 3.6686f, 16.0489f, 3.9504f)
                lineTo(21.2651f, 8.794f)
                curveTo(22.2121f, 9.6733f, 22.7501f, 10.9072f, 22.7501f, 12.1994f)
                curveTo(22.7501f, 13.5616f, 22.1524f, 14.8553f, 21.1151f, 15.7382f)
                lineTo(16.0247f, 20.0711f)
                curveTo(15.7093f, 20.3396f, 15.236f, 20.3016f, 14.9675f, 19.9861f)
                curveTo(14.699f, 19.6707f, 14.737f, 19.1974f, 15.0525f, 18.9289f)
                lineTo(20.1429f, 14.596f)
                curveTo(20.8454f, 13.998f, 21.2501f, 13.122f, 21.2501f, 12.1994f)
                curveTo(21.2501f, 11.3243f, 20.8857f, 10.4887f, 20.2445f, 9.8932f)
                lineTo(15.0283f, 5.0496f)
                curveTo(14.7247f, 4.7677f, 14.7071f, 4.2932f, 14.989f, 3.9897f)
                close()
            }
        }
            .build()
        return _multipleForwardRight!!
    }

private var _multipleForwardRight: ImageVector? = null

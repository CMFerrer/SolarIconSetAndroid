package dev.chiksmedina.solar.bold.messagesconversation

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
import dev.chiksmedina.solar.bold.MessagesConversationGroup

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
                moveTo(12.3315f, 5.1835f)
                lineTo(17.3094f, 9.6083f)
                curveTo(18.2399f, 10.4355f, 18.7052f, 10.8491f, 18.8767f, 11.3374f)
                curveTo(19.0273f, 11.7663f, 19.0273f, 12.2337f, 18.8767f, 12.6626f)
                curveTo(18.7052f, 13.1509f, 18.2399f, 13.5645f, 17.3094f, 14.3917f)
                lineTo(12.3315f, 18.8165f)
                curveTo(11.9092f, 19.1918f, 11.6981f, 19.3795f, 11.5187f, 19.3862f)
                curveTo(11.3629f, 19.3921f, 11.2133f, 19.3249f, 11.1142f, 19.2046f)
                curveTo(11.0f, 19.0661f, 11.0f, 18.7835f, 11.0f, 18.2185f)
                verticalLineTo(15.4286f)
                curveTo(8.572f, 15.4286f, 6.0074f, 16.2084f, 4.1348f, 17.5928f)
                curveTo(3.1599f, 18.3135f, 2.6724f, 18.6739f, 2.4868f, 18.6596f)
                curveTo(2.3058f, 18.6458f, 2.1909f, 18.5751f, 2.097f, 18.4198f)
                curveTo(2.0007f, 18.2604f, 2.0858f, 17.7625f, 2.2559f, 16.7667f)
                curveTo(3.3609f, 10.3006f, 7.8109f, 8.5714f, 11.0f, 8.5714f)
                verticalLineTo(5.7815f)
                curveTo(11.0f, 5.2165f, 11.0f, 4.934f, 11.1142f, 4.7955f)
                curveTo(11.2133f, 4.6751f, 11.3629f, 4.6079f, 11.5187f, 4.6138f)
                curveTo(11.6981f, 4.6205f, 11.9092f, 4.8082f, 12.3315f, 5.1835f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.9889f, 3.9897f)
                curveTo(15.2708f, 3.6861f, 15.7453f, 3.6686f, 16.0488f, 3.9504f)
                lineTo(21.2651f, 8.794f)
                curveTo(22.212f, 9.6733f, 22.75f, 10.9072f, 22.75f, 12.1994f)
                curveTo(22.75f, 13.5616f, 22.1524f, 14.8553f, 21.1151f, 15.7382f)
                lineTo(16.0246f, 20.0711f)
                curveTo(15.7092f, 20.3396f, 15.2359f, 20.3016f, 14.9674f, 19.9861f)
                curveTo(14.6989f, 19.6707f, 14.737f, 19.1974f, 15.0524f, 18.9289f)
                lineTo(20.1428f, 14.596f)
                curveTo(20.8453f, 13.998f, 21.25f, 13.122f, 21.25f, 12.1994f)
                curveTo(21.25f, 11.3243f, 20.8857f, 10.4887f, 20.2444f, 9.8932f)
                lineTo(15.0282f, 5.0496f)
                curveTo(14.7246f, 4.7677f, 14.7071f, 4.2932f, 14.9889f, 3.9897f)
                close()
            }
        }
            .build()
        return _multipleForwardRight!!
    }

private var _multipleForwardRight: ImageVector? = null

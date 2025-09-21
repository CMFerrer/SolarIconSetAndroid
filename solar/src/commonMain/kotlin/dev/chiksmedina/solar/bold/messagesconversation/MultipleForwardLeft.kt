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

val MessagesConversationGroup.MultipleForwardLeft: ImageVector
    get() {
        if (_multipleForwardLeft != null) {
            return _multipleForwardLeft!!
        }
        _multipleForwardLeft = Builder(
            name = "MultipleForwardLeft", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.4751f, 5.1835f)
                lineTo(7.4973f, 9.6083f)
                curveTo(6.5667f, 10.4355f, 6.1014f, 10.8491f, 5.93f, 11.3374f)
                curveTo(5.7794f, 11.7663f, 5.7794f, 12.2337f, 5.93f, 12.6626f)
                curveTo(6.1014f, 13.1509f, 6.5667f, 13.5645f, 7.4973f, 14.3917f)
                lineTo(12.4751f, 18.8165f)
                curveTo(12.8974f, 19.1918f, 13.1086f, 19.3795f, 13.2879f, 19.3862f)
                curveTo(13.4437f, 19.3921f, 13.5934f, 19.3249f, 13.6925f, 19.2046f)
                curveTo(13.8066f, 19.0661f, 13.8066f, 18.7835f, 13.8066f, 18.2185f)
                verticalLineTo(15.4286f)
                curveTo(16.2347f, 15.4286f, 18.7993f, 16.2084f, 20.6719f, 17.5928f)
                curveTo(21.6468f, 18.3135f, 22.1343f, 18.6739f, 22.3199f, 18.6596f)
                curveTo(22.5009f, 18.6458f, 22.6158f, 18.5751f, 22.7097f, 18.4198f)
                curveTo(22.806f, 18.2604f, 22.7209f, 17.7625f, 22.5507f, 16.7667f)
                curveTo(21.4458f, 10.3006f, 16.9958f, 8.5714f, 13.8066f, 8.5714f)
                verticalLineTo(5.7815f)
                curveTo(13.8066f, 5.2165f, 13.8066f, 4.934f, 13.6925f, 4.7955f)
                curveTo(13.5934f, 4.6751f, 13.4437f, 4.6079f, 13.2879f, 4.6138f)
                curveTo(13.1086f, 4.6205f, 12.8974f, 4.8082f, 12.4751f, 5.1835f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.8178f, 3.9897f)
                curveTo(9.5359f, 3.6861f, 9.0614f, 3.6686f, 8.7578f, 3.9504f)
                lineTo(3.5416f, 8.794f)
                curveTo(2.5947f, 9.6733f, 2.0566f, 10.9072f, 2.0566f, 12.1994f)
                curveTo(2.0566f, 13.5616f, 2.6543f, 14.8553f, 3.6916f, 15.7382f)
                lineTo(8.7821f, 20.0711f)
                curveTo(9.0975f, 20.3396f, 9.5708f, 20.3016f, 9.8393f, 19.9861f)
                curveTo(10.1078f, 19.6707f, 10.0697f, 19.1974f, 9.7543f, 18.9289f)
                lineTo(4.6639f, 14.596f)
                curveTo(3.9614f, 13.998f, 3.5566f, 13.122f, 3.5566f, 12.1994f)
                curveTo(3.5566f, 11.3243f, 3.921f, 10.4887f, 4.5623f, 9.8932f)
                lineTo(9.7785f, 5.0496f)
                curveTo(10.082f, 4.7677f, 10.0996f, 4.2932f, 9.8178f, 3.9897f)
                close()
            }
        }
            .build()
        return _multipleForwardLeft!!
    }

private var _multipleForwardLeft: ImageVector? = null

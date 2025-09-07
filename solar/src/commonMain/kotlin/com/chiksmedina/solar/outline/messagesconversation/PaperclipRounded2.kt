package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.PaperclipRounded2: ImageVector
    get() {
        if (_paperclipRounded2 != null) {
            return _paperclipRounded2!!
        }
        _paperclipRounded2 = Builder(
            name = "PaperclipRounded2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.2765f, 3.8928f)
                curveTo(10.8163f, 0.3691f, 16.554f, 0.3691f, 20.0938f, 3.8928f)
                curveTo(23.6354f, 7.4183f, 23.6354f, 13.1358f, 20.0938f, 16.6614f)
                lineTo(16.4191f, 20.3194f)
                curveTo(14.5029f, 22.2269f, 11.3975f, 22.2269f, 9.4813f, 20.3194f)
                curveTo(7.5632f, 18.41f, 7.5632f, 15.3129f, 9.4813f, 13.4035f)
                lineTo(12.4211f, 10.4771f)
                curveTo(12.7146f, 10.1849f, 13.1895f, 10.186f, 13.4817f, 10.4796f)
                curveTo(13.774f, 10.7731f, 13.7729f, 11.248f, 13.4793f, 11.5402f)
                lineTo(10.5396f, 14.4666f)
                curveTo(9.2105f, 15.7896f, 9.2105f, 17.9333f, 10.5396f, 19.2563f)
                curveTo(11.8705f, 20.5812f, 14.0299f, 20.5812f, 15.3608f, 19.2563f)
                lineTo(19.0355f, 15.5983f)
                curveTo(21.9882f, 12.6591f, 21.9882f, 7.8951f, 19.0355f, 4.9558f)
                curveTo(16.081f, 2.0147f, 11.2893f, 2.0147f, 8.3348f, 4.9558f)
                lineTo(4.6601f, 8.6138f)
                curveTo(2.1133f, 11.149f, 2.1133f, 15.2579f, 4.6601f, 17.7931f)
                curveTo(4.9536f, 18.0853f, 4.9547f, 18.5602f, 4.6625f, 18.8538f)
                curveTo(4.3703f, 19.1473f, 3.8954f, 19.1484f, 3.6018f, 18.8562f)
                curveTo(0.4661f, 15.7347f, 0.4661f, 10.6723f, 3.6018f, 7.5507f)
                lineTo(7.2765f, 3.8928f)
                close()
            }
        }
            .build()
        return _paperclipRounded2!!
    }

private var _paperclipRounded2: ImageVector? = null

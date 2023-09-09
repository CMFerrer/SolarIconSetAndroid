package com.chiksmedina.solar.lineduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.lineduotone.MessagesConversationGroup

public val MessagesConversationGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.6357f, 15.6701f)
                lineTo(20.3521f, 10.5208f)
                curveTo(21.8516f, 6.0224f, 22.6013f, 3.7732f, 21.414f, 2.5859f)
                curveTo(20.2268f, 1.3987f, 17.9776f, 2.1484f, 13.4792f, 3.6479f)
                lineTo(8.3299f, 5.3643f)
                curveTo(4.6992f, 6.5745f, 2.8839f, 7.1796f, 2.3681f, 8.067f)
                curveTo(1.8773f, 8.9111f, 1.8773f, 9.9537f, 2.3681f, 10.7978f)
                curveTo(2.8839f, 11.6852f, 4.6992f, 12.2903f, 8.3299f, 13.5005f)
                curveTo(8.9128f, 13.6948f, 9.2043f, 13.792f, 9.4479f, 13.9551f)
                curveTo(9.684f, 14.1131f, 9.8869f, 14.316f, 10.0449f, 14.5521f)
                curveTo(10.208f, 14.7957f, 10.3052f, 15.0872f, 10.4995f, 15.6701f)
                curveTo(11.7097f, 19.3008f, 12.3148f, 21.1161f, 13.2022f, 21.6319f)
                curveTo(14.0463f, 22.1227f, 15.0889f, 22.1227f, 15.933f, 21.6319f)
                curveTo(16.8204f, 21.1161f, 17.4255f, 19.3008f, 18.6357f, 15.6701f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2116f, 8.8482f)
                curveTo(16.5061f, 8.557f, 16.5087f, 8.0821f, 16.2174f, 7.7876f)
                curveTo(15.9262f, 7.4931f, 15.4513f, 7.4904f, 15.1568f, 7.7817f)
                lineTo(16.2116f, 8.8482f)
                close()
                moveTo(10.6626f, 14.336f)
                lineTo(16.2116f, 8.8482f)
                lineTo(15.1568f, 7.7817f)
                lineTo(9.6079f, 13.2695f)
                lineTo(10.6626f, 14.336f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

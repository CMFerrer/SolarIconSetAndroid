package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
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

public val MessagesConversationGroup.Plain3: ImageVector
    get() {
        if (_plain3 != null) {
            return _plain3!!
        }
        _plain3 = Builder(name = "Plain3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(20.3521f, 10.5208f)
                lineTo(18.6357f, 15.6701f)
                curveTo(17.4255f, 19.3008f, 16.8204f, 21.1161f, 15.933f, 21.6319f)
                curveTo(15.0889f, 22.1227f, 14.0463f, 22.1227f, 13.2022f, 21.6319f)
                curveTo(12.3148f, 21.1161f, 11.7097f, 19.3008f, 10.4995f, 15.6701f)
                curveTo(10.3052f, 15.0872f, 10.208f, 14.7957f, 10.0449f, 14.5521f)
                curveTo(9.8869f, 14.316f, 9.684f, 14.1131f, 9.4479f, 13.9551f)
                curveTo(9.2043f, 13.792f, 8.9128f, 13.6948f, 8.3299f, 13.5005f)
                curveTo(4.6992f, 12.2903f, 2.8839f, 11.6852f, 2.3681f, 10.7978f)
                curveTo(1.8773f, 9.9537f, 1.8773f, 8.9111f, 2.3681f, 8.067f)
                curveTo(2.8839f, 7.1796f, 4.6992f, 6.5745f, 8.3299f, 5.3643f)
                lineTo(13.4792f, 3.6479f)
                curveTo(17.9776f, 2.1484f, 20.2268f, 1.3987f, 21.414f, 2.5859f)
                curveTo(22.6013f, 3.7732f, 21.8516f, 6.0224f, 20.3521f, 10.5208f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0456f, 10.9024f)
                curveTo(12.7543f, 10.6079f, 12.757f, 10.1331f, 13.0515f, 9.8418f)
                lineTo(17.262f, 5.6777f)
                curveTo(17.5565f, 5.3864f, 18.0314f, 5.389f, 18.3226f, 5.6835f)
                curveTo(18.6139f, 5.9781f, 18.6113f, 6.4529f, 18.3168f, 6.7442f)
                lineTo(14.1062f, 10.9083f)
                curveTo(13.8117f, 11.1996f, 13.3369f, 11.1969f, 13.0456f, 10.9024f)
                close()
            }
        }
        .build()
        return _plain3!!
    }

private var _plain3: ImageVector? = null

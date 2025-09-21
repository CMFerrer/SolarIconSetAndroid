package dev.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MessagesConversationGroup

val MessagesConversationGroup.Plain3: ImageVector
    get() {
        if (_plain3 != null) {
            return _plain3!!
        }
        _plain3 = Builder(
            name = "Plain3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.6357f, 15.6701f)
                curveTo(17.4255f, 19.3008f, 16.8204f, 21.1161f, 15.933f, 21.6319f)
                curveTo(15.0889f, 22.1227f, 14.0463f, 22.1227f, 13.2022f, 21.6319f)
                curveTo(12.3148f, 21.1161f, 11.7097f, 19.3008f, 10.4995f, 15.6701f)
                curveTo(10.3052f, 15.0872f, 10.208f, 14.7957f, 10.0449f, 14.5521f)
                curveTo(9.8869f, 14.316f, 9.684f, 14.1131f, 9.4479f, 13.9551f)
                curveTo(9.2043f, 13.792f, 8.9128f, 13.6948f, 8.3299f, 13.5005f)
                curveTo(4.6992f, 12.2903f, 2.8839f, 11.6852f, 2.3681f, 10.7978f)
                curveTo(1.8773f, 9.9537f, 1.8773f, 8.9111f, 2.3681f, 8.067f)
                curveTo(2.8839f, 7.1796f, 4.6992f, 6.5745f, 8.3299f, 5.3643f)
                moveTo(20.0257f, 11.5f)
                lineTo(20.3521f, 10.5208f)
                curveTo(21.8516f, 6.0224f, 22.6013f, 3.7732f, 21.414f, 2.5859f)
                curveTo(20.2268f, 1.3987f, 17.9776f, 2.1484f, 13.4792f, 3.6479f)
                lineTo(12.4228f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.7894f, 6.2109f)
                lineTo(13.5789f, 10.375f)
            }
        }
            .build()
        return _plain3!!
    }

private var _plain3: ImageVector? = null

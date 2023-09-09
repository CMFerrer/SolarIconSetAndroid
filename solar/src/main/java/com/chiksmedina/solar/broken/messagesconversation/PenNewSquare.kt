package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

public val MessagesConversationGroup.PenNewSquare: ImageVector
    get() {
        if (_penNewSquare != null) {
            return _penNewSquare!!
        }
        _penNewSquare = Builder(name = "PenNewSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                verticalLineTo(10.5f)
                moveTo(13.5f, 2.0f)
                horizontalLineTo(12.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.4907f, 4.4382f, 2.1644f, 5.8066f, 2.0551f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.652f, 3.4551f)
                lineTo(17.3009f, 2.8062f)
                curveTo(18.3759f, 1.7313f, 20.1188f, 1.7313f, 21.1938f, 2.8062f)
                curveTo(22.2687f, 3.8812f, 22.2687f, 5.6241f, 21.1938f, 6.6991f)
                lineTo(20.5449f, 7.3479f)
                moveTo(16.652f, 3.4551f)
                curveTo(16.652f, 3.4551f, 16.7331f, 4.8338f, 17.9497f, 6.0503f)
                curveTo(19.1662f, 7.2668f, 20.5449f, 7.3479f, 20.5449f, 7.3479f)
                moveTo(16.652f, 3.4551f)
                lineTo(10.6872f, 9.4199f)
                curveTo(10.2832f, 9.8239f, 10.0812f, 10.0259f, 9.9074f, 10.2487f)
                curveTo(9.7025f, 10.5114f, 9.5268f, 10.7957f, 9.3834f, 11.0965f)
                curveTo(9.2619f, 11.3515f, 9.1716f, 11.6225f, 8.9909f, 12.1646f)
                lineTo(8.4124f, 13.9f)
                moveTo(20.5449f, 7.3479f)
                lineTo(17.5625f, 10.3304f)
                moveTo(14.5801f, 13.3128f)
                curveTo(14.1761f, 13.7168f, 13.9741f, 13.9188f, 13.7513f, 14.0926f)
                curveTo(13.4886f, 14.2975f, 13.2043f, 14.4732f, 12.9035f, 14.6166f)
                curveTo(12.6485f, 14.7381f, 12.3775f, 14.8284f, 11.8354f, 15.0091f)
                lineTo(10.1f, 15.5876f)
                moveTo(10.1f, 15.5876f)
                lineTo(8.9771f, 15.9619f)
                curveTo(8.7104f, 16.0508f, 8.4163f, 15.9814f, 8.2174f, 15.7826f)
                curveTo(8.0186f, 15.5837f, 7.9492f, 15.2897f, 8.0381f, 15.0229f)
                lineTo(8.4124f, 13.9f)
                moveTo(10.1f, 15.5876f)
                lineTo(8.4124f, 13.9f)
            }
        }
        .build()
        return _penNewSquare!!
    }

private var _penNewSquare: ImageVector? = null

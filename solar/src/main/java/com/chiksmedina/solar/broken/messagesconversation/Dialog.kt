package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

val MessagesConversationGroup.Dialog: ImageVector
    get() {
        if (_dialog != null) {
            return _dialog!!
        }
        _dialog = Builder(
            name = "Dialog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 7.0703f)
                curveTo(12.8233f, 6.3896f, 11.4571f, 6.0f, 10.0f, 6.0f)
                curveTo(5.5817f, 6.0f, 2.0f, 9.5817f, 2.0f, 14.0f)
                curveTo(2.0f, 15.2797f, 2.3005f, 16.4893f, 2.8348f, 17.562f)
                curveTo(2.9767f, 17.847f, 3.024f, 18.1729f, 2.9417f, 18.4805f)
                lineTo(2.4652f, 20.2613f)
                curveTo(2.2584f, 21.0344f, 2.9656f, 21.7416f, 3.7387f, 21.5348f)
                lineTo(5.5195f, 21.0583f)
                curveTo(5.8271f, 20.976f, 6.153f, 21.0233f, 6.438f, 21.1652f)
                curveTo(7.5107f, 21.6995f, 8.7203f, 22.0f, 10.0f, 22.0f)
                curveTo(14.4183f, 22.0f, 18.0f, 18.4183f, 18.0f, 14.0f)
                curveTo(18.0f, 12.5429f, 17.6104f, 11.1767f, 16.9297f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 14.5018f)
                curveTo(18.0665f, 14.4741f, 18.1324f, 14.4453f, 18.1977f, 14.4155f)
                curveTo(18.5598f, 14.2501f, 18.9661f, 14.1882f, 19.3506f, 14.2911f)
                lineTo(19.8267f, 14.4185f)
                curveTo(20.793f, 14.677f, 21.677f, 13.793f, 21.4185f, 12.8267f)
                lineTo(21.2911f, 12.3506f)
                curveTo(21.1882f, 11.9661f, 21.2501f, 11.5598f, 21.4155f, 11.1977f)
                curveTo(21.7908f, 10.376f, 22.0f, 9.4624f, 22.0f, 8.5f)
                curveTo(22.0f, 7.2259f, 21.6334f, 6.0374f, 21.0f, 5.0343f)
                moveTo(9.5f, 5.9956f)
                curveTo(10.4806f, 3.649f, 12.7977f, 2.0f, 15.5f, 2.0f)
                curveTo(16.7886f, 2.0f, 17.9897f, 2.375f, 19.0f, 3.0218f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5183f, 14.0f)
                horizontalLineTo(6.5273f)
                moveTo(10.009f, 14.0f)
                horizontalLineTo(10.018f)
                moveTo(13.5f, 14.0f)
                horizontalLineTo(13.509f)
            }
        }
            .build()
        return _dialog!!
    }

private var _dialog: ImageVector? = null

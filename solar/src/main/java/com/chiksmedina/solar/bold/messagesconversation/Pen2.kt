package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.MessagesConversationGroup

public val MessagesConversationGroup.Pen2: ImageVector
    get() {
        if (_pen2 != null) {
            return _pen2!!
        }
        _pen2 = Builder(name = "Pen2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.25f, 22.0f)
                curveTo(3.25f, 21.5858f, 3.5858f, 21.25f, 4.0f, 21.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 21.25f, 20.75f, 21.5858f, 20.75f, 22.0f)
                curveTo(20.75f, 22.4142f, 20.4142f, 22.75f, 20.0f, 22.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 22.75f, 3.25f, 22.4142f, 3.25f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5201f, 14.929f)
                lineTo(11.5201f, 14.9289f)
                lineTo(17.4368f, 9.0122f)
                curveTo(16.6315f, 8.6771f, 15.6777f, 8.1266f, 14.7757f, 7.2245f)
                curveTo(13.8736f, 6.3224f, 13.323f, 5.3685f, 12.9879f, 4.5631f)
                lineTo(7.0711f, 10.4799f)
                lineTo(7.071f, 10.48f)
                curveTo(6.6093f, 10.9417f, 6.3785f, 11.1725f, 6.1799f, 11.4271f)
                curveTo(5.9457f, 11.7273f, 5.7449f, 12.0522f, 5.5811f, 12.396f)
                curveTo(5.4422f, 12.6874f, 5.3389f, 12.9972f, 5.1325f, 13.6167f)
                lineTo(4.0436f, 16.8833f)
                curveTo(3.9419f, 17.1882f, 4.0213f, 17.5243f, 4.2485f, 17.7515f)
                curveTo(4.4757f, 17.9787f, 4.8118f, 18.0581f, 5.1167f, 17.9564f)
                lineTo(8.3833f, 16.8676f)
                curveTo(9.0028f, 16.6611f, 9.3126f, 16.5578f, 9.604f, 16.4189f)
                curveTo(9.9478f, 16.2551f, 10.2727f, 16.0543f, 10.5729f, 15.8201f)
                curveTo(10.8275f, 15.6215f, 11.0584f, 15.3907f, 11.5201f, 14.929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0786f, 7.3704f)
                curveTo(20.3071f, 6.1419f, 20.3071f, 4.15f, 19.0786f, 2.9214f)
                curveTo(17.85f, 1.6929f, 15.8581f, 1.6929f, 14.6296f, 2.9214f)
                lineTo(13.9199f, 3.6311f)
                curveTo(13.9296f, 3.6604f, 13.9397f, 3.6902f, 13.9502f, 3.7203f)
                curveTo(14.2103f, 4.47f, 14.701f, 5.4528f, 15.6243f, 6.376f)
                curveTo(16.5475f, 7.2992f, 17.5303f, 7.79f, 18.28f, 8.0501f)
                curveTo(18.31f, 8.0605f, 18.3396f, 8.0705f, 18.3688f, 8.0802f)
                lineTo(19.0786f, 7.3704f)
                close()
            }
        }
        .build()
        return _pen2!!
    }

private var _pen2: ImageVector? = null

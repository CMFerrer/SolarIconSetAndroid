package dev.chiksmedina.solar.boldduotone.designtools

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
import dev.chiksmedina.solar.boldduotone.DesignToolsGroup

val DesignToolsGroup.MirrorRight: ImageVector
    get() {
        if (_mirrorRight != null) {
            return _mirrorRight!!
        }
        _mirrorRight = Builder(
            name = "MirrorRight", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.75f)
                verticalLineTo(10.75f)
                curveTo(22.0f, 6.9788f, 22.0f, 5.0932f, 20.8284f, 3.9216f)
                curveTo(19.7358f, 2.8289f, 17.1523f, 2.7553f, 13.75f, 2.7504f)
                curveTo(13.75f, 2.3361f, 13.4142f, 2.0f, 13.0f, 2.0f)
                curveTo(12.5858f, 2.0f, 12.25f, 2.3358f, 12.25f, 2.75f)
                lineTo(12.25f, 20.75f)
                curveTo(12.25f, 21.1642f, 12.5858f, 21.5f, 13.0f, 21.5f)
                curveTo(13.4142f, 21.5f, 13.75f, 21.1642f, 13.75f, 20.75f)
                curveTo(17.1523f, 20.745f, 19.7358f, 20.6711f, 20.8284f, 19.5784f)
                curveTo(22.0f, 18.4069f, 22.0f, 16.5212f, 22.0f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(11.6591f, 2.75f)
                curveTo(11.6591f, 3.1642f, 11.3233f, 3.5f, 10.9091f, 3.5f)
                horizontalLineTo(10.0f)
                curveTo(9.5638f, 3.5f, 9.1653f, 3.5f, 8.7976f, 3.5032f)
                curveTo(8.3834f, 3.5068f, 8.0447f, 3.1739f, 8.0411f, 2.7597f)
                curveTo(8.0375f, 2.3455f, 8.3704f, 2.0068f, 8.7846f, 2.0032f)
                curveTo(9.1594f, 2.0f, 9.564f, 2.0f, 9.9979f, 2.0f)
                lineTo(10.9091f, 2.0f)
                curveTo(11.3233f, 2.0f, 11.6591f, 2.3358f, 11.6591f, 2.75f)
                close()
                moveTo(11.6591f, 20.75f)
                curveTo(11.6591f, 21.1642f, 11.3233f, 21.5f, 10.9091f, 21.5f)
                horizontalLineTo(9.9977f)
                curveTo(9.5639f, 21.5f, 9.1594f, 21.5f, 8.7846f, 21.4968f)
                curveTo(8.3704f, 21.4932f, 8.0375f, 21.1545f, 8.0411f, 20.7403f)
                curveTo(8.0447f, 20.3261f, 8.3834f, 19.9932f, 8.7976f, 19.9968f)
                curveTo(9.1653f, 20.0f, 9.5638f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(10.9091f)
                curveTo(11.3233f, 20.0f, 11.6591f, 20.3358f, 11.6591f, 20.75f)
                close()
                moveTo(6.6288f, 2.8046f)
                curveTo(6.7517f, 3.2002f, 6.5307f, 3.6205f, 6.1352f, 3.7434f)
                curveTo(5.814f, 3.8432f, 5.5905f, 3.9775f, 5.409f, 4.159f)
                curveTo(5.2275f, 4.3405f, 5.0932f, 4.564f, 4.9934f, 4.8852f)
                curveTo(4.8705f, 5.2807f, 4.4502f, 5.5017f, 4.0546f, 5.3788f)
                curveTo(3.659f, 5.2559f, 3.4381f, 4.8356f, 3.561f, 4.44f)
                curveTo(3.7212f, 3.9246f, 3.9688f, 3.4779f, 4.3484f, 3.0984f)
                curveTo(4.7279f, 2.7188f, 5.1746f, 2.4712f, 5.69f, 2.311f)
                curveTo(6.0856f, 2.1881f, 6.5059f, 2.409f, 6.6288f, 2.8046f)
                close()
                moveTo(6.6288f, 20.6954f)
                curveTo(6.5059f, 21.091f, 6.0856f, 21.312f, 5.69f, 21.189f)
                curveTo(5.1746f, 21.0288f, 4.7279f, 20.7812f, 4.3484f, 20.4017f)
                curveTo(3.9688f, 20.0221f, 3.7212f, 19.5754f, 3.561f, 19.06f)
                curveTo(3.4381f, 18.6644f, 3.659f, 18.2441f, 4.0546f, 18.1212f)
                curveTo(4.4502f, 17.9983f, 4.8705f, 18.2193f, 4.9934f, 18.6148f)
                curveTo(5.0932f, 18.936f, 5.2275f, 19.1595f, 5.409f, 19.341f)
                curveTo(5.5905f, 19.5225f, 5.814f, 19.6568f, 6.1352f, 19.7566f)
                curveTo(6.5307f, 19.8795f, 6.7517f, 20.2998f, 6.6288f, 20.6954f)
                close()
                moveTo(4.0097f, 6.7911f)
                curveTo(4.4239f, 6.7947f, 4.7568f, 7.1334f, 4.7532f, 7.5476f)
                curveTo(4.75f, 7.9153f, 4.75f, 8.3138f, 4.75f, 8.75f)
                verticalLineTo(10.1136f)
                curveTo(4.75f, 10.5278f, 4.4142f, 10.8636f, 4.0f, 10.8636f)
                curveTo(3.5858f, 10.8636f, 3.25f, 10.5278f, 3.25f, 10.1136f)
                lineTo(3.25f, 8.7477f)
                curveTo(3.25f, 8.3139f, 3.25f, 7.9094f, 3.2532f, 7.5346f)
                curveTo(3.2568f, 7.1204f, 3.5955f, 6.7875f, 4.0097f, 6.7911f)
                close()
                moveTo(4.0097f, 16.7089f)
                curveTo(3.5955f, 16.7125f, 3.2568f, 16.3796f, 3.2532f, 15.9654f)
                curveTo(3.25f, 15.5906f, 3.25f, 15.186f, 3.25f, 14.7523f)
                lineTo(3.25f, 13.3864f)
                curveTo(3.25f, 12.9722f, 3.5858f, 12.6364f, 4.0f, 12.6364f)
                curveTo(4.4142f, 12.6364f, 4.75f, 12.9721f, 4.75f, 13.3864f)
                lineTo(4.75f, 14.75f)
                curveTo(4.75f, 15.1862f, 4.75f, 15.5847f, 4.7532f, 15.9524f)
                curveTo(4.7568f, 16.3666f, 4.4239f, 16.7053f, 4.0097f, 16.7089f)
                close()
            }
        }
            .build()
        return _mirrorRight!!
    }

private var _mirrorRight: ImageVector? = null

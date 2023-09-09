package com.chiksmedina.solar.bold.designtools

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
import com.chiksmedina.solar.bold.DesignToolsGroup

public val DesignToolsGroup.MirrorLeft: ImageVector
    get() {
        if (_mirrorLeft != null) {
            return _mirrorLeft!!
        }
        _mirrorLeft = Builder(name = "MirrorLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.3408f, 20.75f)
                curveTo(13.3408f, 20.3358f, 13.6766f, 20.0f, 14.0908f, 20.0f)
                horizontalLineTo(14.9999f)
                curveTo(15.4361f, 20.0f, 15.8346f, 20.0f, 16.2023f, 19.9968f)
                curveTo(16.6165f, 19.9932f, 16.9552f, 20.3261f, 16.9588f, 20.7403f)
                curveTo(16.9624f, 21.1545f, 16.6295f, 21.4932f, 16.2153f, 21.4968f)
                curveTo(15.8405f, 21.5f, 15.4359f, 21.5f, 15.0021f, 21.5f)
                horizontalLineTo(14.0908f)
                curveTo(13.6766f, 21.5f, 13.3408f, 21.1642f, 13.3408f, 20.75f)
                close()
                moveTo(13.3408f, 2.75f)
                curveTo(13.3408f, 2.3358f, 13.6766f, 2.0f, 14.0908f, 2.0f)
                lineTo(15.0022f, 2.0f)
                curveTo(15.436f, 2.0f, 15.8405f, 2.0f, 16.2153f, 2.0032f)
                curveTo(16.6295f, 2.0068f, 16.9624f, 2.3455f, 16.9588f, 2.7597f)
                curveTo(16.9552f, 3.1739f, 16.6165f, 3.5068f, 16.2023f, 3.5032f)
                curveTo(15.8346f, 3.5f, 15.4361f, 3.5f, 14.9999f, 3.5f)
                horizontalLineTo(14.0908f)
                curveTo(13.6766f, 3.5f, 13.3408f, 3.1642f, 13.3408f, 2.75f)
                close()
                moveTo(18.3711f, 20.6954f)
                curveTo(18.2482f, 20.2998f, 18.4692f, 19.8795f, 18.8647f, 19.7566f)
                curveTo(19.1859f, 19.6568f, 19.4094f, 19.5225f, 19.5909f, 19.341f)
                curveTo(19.7724f, 19.1595f, 19.9067f, 18.936f, 20.0065f, 18.6148f)
                curveTo(20.1294f, 18.2193f, 20.5498f, 17.9983f, 20.9453f, 18.1212f)
                curveTo(21.3409f, 18.2441f, 21.5619f, 18.6644f, 21.4389f, 19.06f)
                curveTo(21.2788f, 19.5754f, 21.0311f, 20.0221f, 20.6516f, 20.4017f)
                curveTo(20.272f, 20.7812f, 19.8253f, 21.0288f, 19.3099f, 21.189f)
                curveTo(18.9143f, 21.312f, 18.494f, 21.0909f, 18.3711f, 20.6954f)
                close()
                moveTo(18.3711f, 2.8046f)
                curveTo(18.494f, 2.409f, 18.9143f, 2.1881f, 19.3099f, 2.311f)
                curveTo(19.8253f, 2.4712f, 20.272f, 2.7188f, 20.6516f, 3.0984f)
                curveTo(21.0311f, 3.4779f, 21.2788f, 3.9246f, 21.4389f, 4.44f)
                curveTo(21.5619f, 4.8356f, 21.3409f, 5.2559f, 20.9453f, 5.3788f)
                curveTo(20.5498f, 5.5017f, 20.1294f, 5.2807f, 20.0065f, 4.8852f)
                curveTo(19.9067f, 4.564f, 19.7724f, 4.3405f, 19.5909f, 4.159f)
                curveTo(19.4094f, 3.9775f, 19.1859f, 3.8432f, 18.8647f, 3.7434f)
                curveTo(18.4692f, 3.6205f, 18.2482f, 3.2002f, 18.3711f, 2.8046f)
                close()
                moveTo(20.9902f, 16.7089f)
                curveTo(20.576f, 16.7053f, 20.2432f, 16.3666f, 20.2467f, 15.9524f)
                curveTo(20.2499f, 15.5847f, 20.2499f, 15.1862f, 20.2499f, 14.75f)
                verticalLineTo(13.3864f)
                curveTo(20.2499f, 12.9722f, 20.5857f, 12.6364f, 20.9999f, 12.6364f)
                curveTo(21.4141f, 12.6364f, 21.7499f, 12.9722f, 21.7499f, 13.3864f)
                verticalLineTo(14.7523f)
                curveTo(21.7499f, 15.186f, 21.7499f, 15.5906f, 21.7467f, 15.9654f)
                curveTo(21.7431f, 16.3796f, 21.4044f, 16.7125f, 20.9902f, 16.7089f)
                close()
                moveTo(20.9902f, 6.7911f)
                curveTo(21.4044f, 6.7875f, 21.7431f, 7.1204f, 21.7467f, 7.5346f)
                curveTo(21.7499f, 7.9094f, 21.7499f, 8.3139f, 21.7499f, 8.7477f)
                verticalLineTo(10.1136f)
                curveTo(21.7499f, 10.5279f, 21.4141f, 10.8636f, 20.9999f, 10.8636f)
                curveTo(20.5857f, 10.8636f, 20.2499f, 10.5279f, 20.2499f, 10.1136f)
                verticalLineTo(8.75f)
                curveTo(20.2499f, 8.3138f, 20.2499f, 7.9153f, 20.2467f, 7.5476f)
                curveTo(20.2432f, 7.1334f, 20.576f, 6.7947f, 20.9902f, 6.7911f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.75f)
                lineTo(3.0f, 12.75f)
                curveTo(3.0f, 16.5212f, 3.0f, 18.4069f, 4.1716f, 19.5784f)
                curveTo(5.2642f, 20.6711f, 7.8477f, 20.745f, 11.25f, 20.75f)
                curveTo(11.25f, 21.1642f, 11.5858f, 21.5f, 12.0f, 21.5f)
                curveTo(12.4142f, 21.5f, 12.75f, 21.1642f, 12.75f, 20.75f)
                lineTo(12.75f, 2.75f)
                curveTo(12.75f, 2.3358f, 12.4142f, 2.0f, 12.0f, 2.0f)
                curveTo(11.5858f, 2.0f, 11.25f, 2.3358f, 11.25f, 2.75f)
                curveTo(7.8477f, 2.755f, 5.2642f, 2.8289f, 4.1716f, 3.9216f)
                curveTo(3.0f, 5.0932f, 3.0f, 6.9788f, 3.0f, 10.75f)
                close()
            }
        }
        .build()
        return _mirrorLeft!!
    }

private var _mirrorLeft: ImageVector? = null

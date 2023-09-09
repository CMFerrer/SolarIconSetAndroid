package com.chiksmedina.solar.boldduotone.designtools

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
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

public val DesignToolsGroup.MirrorLeft: ImageVector
    get() {
        if (_mirrorLeft != null) {
            return _mirrorLeft!!
        }
        _mirrorLeft = Builder(name = "MirrorLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.25f, 12.75f)
                verticalLineTo(10.75f)
                curveTo(3.25f, 6.9788f, 3.25f, 5.0932f, 4.4216f, 3.9216f)
                curveTo(5.5142f, 2.8289f, 8.0977f, 2.7553f, 11.5f, 2.7504f)
                curveTo(11.5f, 2.3361f, 11.8358f, 2.0f, 12.25f, 2.0f)
                curveTo(12.6642f, 2.0f, 13.0f, 2.3358f, 13.0f, 2.75f)
                lineTo(13.0f, 20.75f)
                curveTo(13.0f, 21.1642f, 12.6642f, 21.5f, 12.25f, 21.5f)
                curveTo(11.8358f, 21.5f, 11.5f, 21.1642f, 11.5f, 20.75f)
                curveTo(8.0977f, 20.745f, 5.5142f, 20.6711f, 4.4216f, 19.5784f)
                curveTo(3.25f, 18.4069f, 3.25f, 16.5212f, 3.25f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.5908f, 2.75f)
                curveTo(13.5908f, 3.1642f, 13.9266f, 3.5f, 14.3408f, 3.5f)
                horizontalLineTo(15.2499f)
                curveTo(15.6861f, 3.5f, 16.0846f, 3.5f, 16.4523f, 3.5032f)
                curveTo(16.8665f, 3.5068f, 17.2052f, 3.1739f, 17.2088f, 2.7597f)
                curveTo(17.2124f, 2.3455f, 16.8795f, 2.0068f, 16.4653f, 2.0032f)
                curveTo(16.0905f, 2.0f, 15.6859f, 2.0f, 15.2521f, 2.0f)
                lineTo(14.3408f, 2.0f)
                curveTo(13.9266f, 2.0f, 13.5908f, 2.3358f, 13.5908f, 2.75f)
                close()
                moveTo(13.5908f, 20.75f)
                curveTo(13.5908f, 21.1642f, 13.9266f, 21.5f, 14.3408f, 21.5f)
                horizontalLineTo(15.2522f)
                curveTo(15.686f, 21.5f, 16.0905f, 21.5f, 16.4653f, 21.4968f)
                curveTo(16.8795f, 21.4932f, 17.2124f, 21.1545f, 17.2088f, 20.7403f)
                curveTo(17.2052f, 20.3261f, 16.8665f, 19.9932f, 16.4523f, 19.9968f)
                curveTo(16.0846f, 20.0f, 15.6861f, 20.0f, 15.2499f, 20.0f)
                horizontalLineTo(14.3408f)
                curveTo(13.9266f, 20.0f, 13.5908f, 20.3358f, 13.5908f, 20.75f)
                close()
                moveTo(18.6211f, 2.8046f)
                curveTo(18.4982f, 3.2002f, 18.7192f, 3.6205f, 19.1147f, 3.7434f)
                curveTo(19.4359f, 3.8432f, 19.6594f, 3.9775f, 19.8409f, 4.159f)
                curveTo(20.0224f, 4.3405f, 20.1567f, 4.564f, 20.2565f, 4.8852f)
                curveTo(20.3794f, 5.2807f, 20.7998f, 5.5017f, 21.1953f, 5.3788f)
                curveTo(21.5909f, 5.2559f, 21.8119f, 4.8356f, 21.6889f, 4.44f)
                curveTo(21.5288f, 3.9246f, 21.2811f, 3.4779f, 20.9016f, 3.0984f)
                curveTo(20.522f, 2.7188f, 20.0753f, 2.4712f, 19.5599f, 2.311f)
                curveTo(19.1643f, 2.1881f, 18.744f, 2.409f, 18.6211f, 2.8046f)
                close()
                moveTo(18.6211f, 20.6954f)
                curveTo(18.744f, 21.091f, 19.1643f, 21.312f, 19.5599f, 21.189f)
                curveTo(20.0753f, 21.0288f, 20.522f, 20.7812f, 20.9016f, 20.4017f)
                curveTo(21.2811f, 20.0221f, 21.5288f, 19.5754f, 21.6889f, 19.06f)
                curveTo(21.8119f, 18.6644f, 21.5909f, 18.2441f, 21.1953f, 18.1212f)
                curveTo(20.7998f, 17.9983f, 20.3794f, 18.2193f, 20.2565f, 18.6148f)
                curveTo(20.1567f, 18.936f, 20.0224f, 19.1595f, 19.8409f, 19.341f)
                curveTo(19.6594f, 19.5225f, 19.4359f, 19.6568f, 19.1147f, 19.7566f)
                curveTo(18.7192f, 19.8795f, 18.4982f, 20.2998f, 18.6211f, 20.6954f)
                close()
                moveTo(21.2402f, 6.7911f)
                curveTo(20.826f, 6.7947f, 20.4932f, 7.1334f, 20.4967f, 7.5476f)
                curveTo(20.4999f, 7.9153f, 20.4999f, 8.3138f, 20.4999f, 8.75f)
                verticalLineTo(10.1136f)
                curveTo(20.4999f, 10.5278f, 20.8357f, 10.8636f, 21.2499f, 10.8636f)
                curveTo(21.6641f, 10.8636f, 21.9999f, 10.5278f, 21.9999f, 10.1136f)
                verticalLineTo(8.7477f)
                curveTo(21.9999f, 8.3139f, 21.9999f, 7.9094f, 21.9967f, 7.5346f)
                curveTo(21.9931f, 7.1204f, 21.6544f, 6.7875f, 21.2402f, 6.7911f)
                close()
                moveTo(21.2402f, 16.7089f)
                curveTo(21.6544f, 16.7125f, 21.9931f, 16.3796f, 21.9967f, 15.9654f)
                curveTo(21.9999f, 15.5906f, 21.9999f, 15.186f, 21.9999f, 14.7523f)
                verticalLineTo(13.3864f)
                curveTo(21.9999f, 12.9722f, 21.6641f, 12.6364f, 21.2499f, 12.6364f)
                curveTo(20.8357f, 12.6364f, 20.4999f, 12.9721f, 20.4999f, 13.3864f)
                verticalLineTo(14.75f)
                curveTo(20.4999f, 15.1862f, 20.4999f, 15.5847f, 20.4967f, 15.9524f)
                curveTo(20.4932f, 16.3666f, 20.826f, 16.7053f, 21.2402f, 16.7089f)
                close()
            }
        }
        .build()
        return _mirrorLeft!!
    }

private var _mirrorLeft: ImageVector? = null

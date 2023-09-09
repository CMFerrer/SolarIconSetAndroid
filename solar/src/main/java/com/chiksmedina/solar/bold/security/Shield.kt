package com.chiksmedina.solar.bold.security

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
import com.chiksmedina.solar.bold.SecurityGroup

public val SecurityGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 2.0734f)
                curveTo(10.6437f, 2.1865f, 9.9316f, 2.4303f, 8.8377f, 2.8047f)
                lineTo(8.2649f, 3.0008f)
                curveTo(5.2583f, 4.03f, 3.755f, 4.5445f, 3.3775f, 5.0824f)
                curveTo(3.0082f, 5.6085f, 3.0002f, 7.1497f, 3.0f, 10.2094f)
                lineTo(11.25f, 7.4594f)
                verticalLineTo(2.0734f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 9.0406f)
                lineTo(3.0f, 11.7906f)
                verticalLineTo(11.9914f)
                curveTo(3.0f, 17.6294f, 7.239f, 20.3655f, 9.8986f, 21.5273f)
                curveTo(10.4093f, 21.7504f, 10.7392f, 21.8945f, 11.25f, 21.9597f)
                verticalLineTo(9.0406f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 21.9597f)
                verticalLineTo(9.0406f)
                lineTo(21.0f, 11.7906f)
                verticalLineTo(11.9914f)
                curveTo(21.0f, 17.6294f, 16.761f, 20.3655f, 14.1014f, 21.5273f)
                curveTo(13.5907f, 21.7504f, 13.2608f, 21.8945f, 12.75f, 21.9597f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 7.4594f)
                verticalLineTo(2.0734f)
                curveTo(13.3563f, 2.1865f, 14.0684f, 2.4303f, 15.1623f, 2.8047f)
                lineTo(15.7351f, 3.0008f)
                curveTo(18.7417f, 4.03f, 20.245f, 4.5445f, 20.6225f, 5.0824f)
                curveTo(20.9918f, 5.6085f, 20.9998f, 7.1497f, 21.0f, 10.2094f)
                lineTo(12.75f, 7.4594f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null

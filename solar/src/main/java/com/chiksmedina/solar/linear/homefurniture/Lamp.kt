package com.chiksmedina.solar.linear.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.HomeFurnitureGroup

public val HomeFurnitureGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9616f, 7.4445f)
                curveTo(5.5704f, 5.0991f, 5.8749f, 3.9264f, 6.661f, 3.1514f)
                curveTo(6.8889f, 2.9268f, 7.1429f, 2.7303f, 7.4177f, 2.5662f)
                curveTo(8.3653f, 2.0f, 9.5769f, 2.0f, 12.0f, 2.0f)
                curveTo(14.4232f, 2.0f, 15.6348f, 2.0f, 16.5824f, 2.5662f)
                curveTo(16.8571f, 2.7303f, 17.1111f, 2.9268f, 17.339f, 3.1514f)
                curveTo(18.1252f, 3.9264f, 18.4296f, 5.0991f, 19.0385f, 7.4445f)
                lineTo(19.1227f, 7.769f)
                curveTo(19.9506f, 10.9576f, 20.3645f, 12.5519f, 19.6126f, 13.6719f)
                curveTo(19.5377f, 13.7837f, 19.4552f, 13.8902f, 19.3659f, 13.9909f)
                curveTo(18.4707f, 15.0f, 16.8236f, 15.0f, 13.5293f, 15.0f)
                horizontalLineTo(10.4708f)
                curveTo(7.1765f, 15.0f, 5.5293f, 15.0f, 4.6341f, 13.9909f)
                curveTo(4.5448f, 13.8902f, 4.4624f, 13.7837f, 4.3874f, 13.6719f)
                curveTo(3.6356f, 12.5519f, 4.0495f, 10.9576f, 4.8773f, 7.769f)
                lineTo(4.9616f, 7.4445f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 15.0f)
                verticalLineTo(17.0f)
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null

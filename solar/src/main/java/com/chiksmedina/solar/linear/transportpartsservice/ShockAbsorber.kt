package com.chiksmedina.solar.linear.transportpartsservice

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
import com.chiksmedina.solar.linear.TransportPartsServiceGroup

public val TransportPartsServiceGroup.ShockAbsorber: ImageVector
    get() {
        if (_shockAbsorber != null) {
            return _shockAbsorber!!
        }
        _shockAbsorber = Builder(name = "ShockAbsorber", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                curveTo(14.0f, 21.1046f, 13.1046f, 22.0f, 12.0f, 22.0f)
                curveTo(10.8954f, 22.0f, 10.0f, 21.1046f, 10.0f, 20.0f)
                curveTo(10.0f, 18.8954f, 10.8954f, 18.0f, 12.0f, 18.0f)
                curveTo(13.1046f, 18.0f, 14.0f, 18.8954f, 14.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveTo(6.0f, 3.0572f, 6.0f, 2.5858f, 6.2929f, 2.2929f)
                curveTo(6.5858f, 2.0f, 7.0572f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(16.9428f, 2.0f, 17.4142f, 2.0f, 17.7071f, 2.2929f)
                curveTo(18.0f, 2.5858f, 18.0f, 3.0572f, 18.0f, 4.0f)
                curveTo(18.0f, 4.9428f, 18.0f, 5.4142f, 17.7071f, 5.7071f)
                curveTo(17.4142f, 6.0f, 16.9428f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.0572f, 6.0f, 6.5858f, 6.0f, 6.2929f, 5.7071f)
                curveTo(6.0f, 5.4142f, 6.0f, 4.9428f, 6.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 16.5f)
                curveTo(8.5f, 15.6716f, 9.1716f, 15.0f, 10.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(14.8284f, 15.0f, 15.5f, 15.6716f, 15.5f, 16.5f)
                curveTo(15.5f, 17.3284f, 14.8284f, 18.0f, 14.0f, 18.0f)
                horizontalLineTo(10.0f)
                curveTo(9.1716f, 18.0f, 8.5f, 17.3284f, 8.5f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 15.5f)
                verticalLineTo(5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.5f)
                verticalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                lineTo(16.0f, 10.0f)
                moveTo(8.0f, 11.5f)
                lineTo(16.0f, 13.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 11.4995f)
                lineTo(22.0f, 11.4995f)
                moveTo(4.0f, 11.5005f)
                horizontalLineTo(2.0f)
                moveTo(19.0713f, 14.3f)
                lineTo(19.7784f, 15.0f)
                moveTo(4.9287f, 14.3f)
                lineTo(4.2216f, 15.0f)
                moveTo(19.0713f, 8.7f)
                lineTo(19.7784f, 8.0f)
                moveTo(4.9287f, 8.7f)
                lineTo(4.2216f, 8.0f)
            }
        }
        .build()
        return _shockAbsorber!!
    }

private var _shockAbsorber: ImageVector? = null

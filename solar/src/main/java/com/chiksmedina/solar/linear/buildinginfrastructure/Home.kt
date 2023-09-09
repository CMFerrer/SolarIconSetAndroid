package com.chiksmedina.solar.linear.buildinginfrastructure

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
import com.chiksmedina.solar.linear.BuildingInfrastructureGroup

public val BuildingInfrastructureGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                lineTo(10.1259f, 4.4993f)
                curveTo(11.2216f, 3.6228f, 12.7784f, 3.6228f, 13.8741f, 4.4993f)
                lineTo(22.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(15.5f, 3.2239f, 15.7239f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(18.5f)
                curveTo(18.7761f, 3.0f, 19.0f, 3.2239f, 19.0f, 3.5f)
                verticalLineTo(8.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                verticalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                verticalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                verticalLineTo(17.0f)
                curveTo(15.0f, 15.5858f, 15.0f, 14.8787f, 14.5607f, 14.4393f)
                curveTo(14.1213f, 14.0f, 13.4142f, 14.0f, 12.0f, 14.0f)
                curveTo(10.5858f, 14.0f, 9.8787f, 14.0f, 9.4393f, 14.4393f)
                curveTo(9.0f, 14.8787f, 9.0f, 15.5858f, 9.0f, 17.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 9.5f)
                curveTo(14.0f, 10.6046f, 13.1046f, 11.5f, 12.0f, 11.5f)
                curveTo(10.8954f, 11.5f, 10.0f, 10.6046f, 10.0f, 9.5f)
                curveTo(10.0f, 8.3954f, 10.8954f, 7.5f, 12.0f, 7.5f)
                curveTo(13.1046f, 7.5f, 14.0f, 8.3954f, 14.0f, 9.5f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null

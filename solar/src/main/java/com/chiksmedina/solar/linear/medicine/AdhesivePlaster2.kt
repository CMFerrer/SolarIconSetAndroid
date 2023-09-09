package com.chiksmedina.solar.linear.medicine

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
import com.chiksmedina.solar.linear.MedicineGroup

public val MedicineGroup.AdhesivePlaster2: ImageVector
    get() {
        if (_adhesivePlaster2 != null) {
            return _adhesivePlaster2!!
        }
        _adhesivePlaster2 = Builder(name = "AdhesivePlaster2", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.765f, 20.4155f)
                lineTo(3.5845f, 11.235f)
                moveTo(12.765f, 20.4155f)
                curveTo(14.8777f, 22.5282f, 18.3029f, 22.5282f, 20.4155f, 20.4155f)
                curveTo(22.5282f, 18.3029f, 22.5282f, 14.8777f, 20.4155f, 12.765f)
                moveTo(12.765f, 20.4155f)
                lineTo(20.4155f, 12.765f)
                moveTo(20.4155f, 12.765f)
                lineTo(11.235f, 3.5845f)
                moveTo(11.235f, 3.5845f)
                curveTo(9.1223f, 1.4718f, 5.6971f, 1.4718f, 3.5845f, 3.5845f)
                curveTo(1.4718f, 5.6971f, 1.4718f, 9.1223f, 3.5845f, 11.235f)
                moveTo(11.235f, 3.5845f)
                lineTo(3.5845f, 11.235f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1716f, 12.0f)
                moveToRelative(-0.7071f, 0.7071f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4142f, -1.4142f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4142f, 1.4142f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.8284f)
                moveToRelative(-0.7071f, 0.7071f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4142f, -1.4142f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4142f, 1.4142f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.1716f)
                moveToRelative(-0.7071f, 0.7071f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4142f, -1.4142f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4142f, 1.4142f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8284f, 12.0f)
                moveToRelative(-0.7071f, 0.7071f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4142f, -1.4142f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4142f, 1.4142f)
            }
        }
        .build()
        return _adhesivePlaster2!!
    }

private var _adhesivePlaster2: ImageVector? = null

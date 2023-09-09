package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.HomeAddAngle: ImageVector
    get() {
        if (_homeAddAngle != null) {
            return _homeAddAngle!!
        }
        _homeAddAngle = Builder(name = "HomeAddAngle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.364f, 12.958f)
                curveTo(1.9845f, 10.321f, 1.7948f, 9.0025f, 2.3352f, 7.8751f)
                curveTo(2.8757f, 6.7478f, 4.0261f, 6.0625f, 6.3268f, 4.692f)
                lineTo(7.7116f, 3.867f)
                curveTo(9.8009f, 2.6225f, 10.8456f, 2.0002f, 11.9999f, 2.0002f)
                curveTo(13.1542f, 2.0002f, 14.1988f, 2.6225f, 16.2881f, 3.867f)
                lineTo(17.673f, 4.692f)
                curveTo(19.9737f, 6.0625f, 21.1241f, 6.7478f, 21.6645f, 7.8751f)
                curveTo(22.205f, 9.0025f, 22.0153f, 10.321f, 21.6358f, 12.9581f)
                lineTo(21.357f, 14.8954f)
                curveTo(20.8696f, 18.2828f, 20.6259f, 19.9766f, 19.4509f, 20.9884f)
                curveTo(18.2758f, 22.0002f, 16.5525f, 22.0002f, 13.106f, 22.0002f)
                horizontalLineTo(10.8938f)
                curveTo(7.4472f, 22.0002f, 5.724f, 22.0002f, 4.5489f, 20.9884f)
                curveTo(3.3738f, 19.9766f, 3.1301f, 18.2828f, 2.6427f, 14.8954f)
                lineTo(2.364f, 12.958f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                lineTo(12.0f, 13.0f)
                moveTo(12.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                moveTo(12.0f, 13.0f)
                lineTo(12.0f, 10.0f)
                moveTo(12.0f, 13.0f)
                lineTo(12.0f, 16.0f)
            }
        }
        .build()
        return _homeAddAngle!!
    }

private var _homeAddAngle: ImageVector? = null

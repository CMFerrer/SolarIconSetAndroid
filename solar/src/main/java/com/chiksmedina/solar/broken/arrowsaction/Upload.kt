package com.chiksmedina.solar.broken.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ArrowsActionGroup

public val ArrowsActionGroup.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                lineTo(12.0f, 2.0f)
                moveTo(12.0f, 2.0f)
                lineTo(15.0f, 5.5f)
                moveTo(12.0f, 2.0f)
                lineTo(9.0f, 5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 22.0002f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 22.0002f, 20.2426f, 22.0002f, 21.1213f, 21.1215f)
                curveTo(22.0f, 20.2429f, 22.0f, 18.8286f, 22.0f, 16.0002f)
                verticalLineTo(15.0002f)
                curveTo(22.0f, 12.1718f, 22.0f, 10.7576f, 21.1213f, 9.8789f)
                curveTo(20.3529f, 9.1105f, 19.175f, 9.0141f, 17.0f, 9.002f)
                moveTo(7.0f, 9.002f)
                curveTo(4.825f, 9.0141f, 3.6471f, 9.1105f, 2.8787f, 9.8789f)
                curveTo(2.0f, 10.7576f, 2.0f, 12.1718f, 2.0f, 15.0002f)
                lineTo(2.0f, 16.0002f)
                curveTo(2.0f, 18.8286f, 2.0f, 20.2429f, 2.8787f, 21.1215f)
                curveTo(3.1785f, 21.4213f, 3.5406f, 21.6188f, 4.0f, 21.749f)
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null

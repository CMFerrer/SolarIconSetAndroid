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

public val ArrowsActionGroup.Login2: ImageVector
    get() {
        if (_login2 != null) {
            return _login2!!
        }
        _login2 = Builder(name = "Login2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.001f, 11.999f)
                lineTo(16.001f, 11.999f)
                moveTo(16.001f, 11.999f)
                lineTo(12.501f, 8.999f)
                moveTo(16.001f, 11.999f)
                lineTo(12.501f, 14.999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.002f, 7.0f)
                curveTo(9.0141f, 4.825f, 9.1105f, 3.6471f, 9.8789f, 2.8787f)
                curveTo(10.7576f, 2.0f, 12.1718f, 2.0f, 15.0002f, 2.0f)
                lineTo(16.0002f, 2.0f)
                curveTo(18.8286f, 2.0f, 20.2429f, 2.0f, 21.1215f, 2.8787f)
                curveTo(22.0002f, 3.7574f, 22.0002f, 5.1716f, 22.0002f, 8.0f)
                lineTo(22.0002f, 16.0f)
                curveTo(22.0002f, 18.8284f, 22.0002f, 20.2426f, 21.1215f, 21.1213f)
                curveTo(20.3531f, 21.8897f, 19.1752f, 21.9862f, 17.0f, 21.9983f)
                moveTo(9.002f, 17.0f)
                curveTo(9.0141f, 19.175f, 9.1105f, 20.3529f, 9.8789f, 21.1213f)
                curveTo(10.5202f, 21.7626f, 11.4467f, 21.9359f, 13.0f, 21.9827f)
            }
        }
        .build()
        return _login2!!
    }

private var _login2: ImageVector? = null
package dev.chiksmedina.solar.linear.arrows

import androidx.compose.ui.graphics.Color
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
import dev.chiksmedina.solar.linear.ArrowsGroup

val ArrowsGroup.RestartCircle: ImageVector
    get() {
        if (_restartCircle != null) {
            return _restartCircle!!
        }
        _restartCircle = Builder(
            name = "RestartCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.9775f, 8.7145f)
                lineTo(15.5355f, 8.2621f)
                curveTo(13.5829f, 6.2632f, 10.4171f, 6.2632f, 8.4645f, 8.2621f)
                curveTo(6.5118f, 10.261f, 6.5118f, 13.5019f, 8.4645f, 15.5008f)
                curveTo(10.4171f, 17.4997f, 13.5829f, 17.4997f, 15.5355f, 15.5008f)
                curveTo(16.671f, 14.3384f, 17.1462f, 12.7559f, 16.9611f, 11.242f)
                moveTo(15.9775f, 8.7145f)
                horizontalLineTo(13.3258f)
                moveTo(15.9775f, 8.7145f)
                verticalLineTo(6.0f)
            }
        }
            .build()
        return _restartCircle!!
    }

private var _restartCircle: ImageVector? = null

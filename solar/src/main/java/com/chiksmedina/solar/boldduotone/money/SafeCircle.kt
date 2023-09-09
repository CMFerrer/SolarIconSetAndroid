package com.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.MoneyGroup

public val MoneyGroup.SafeCircle: ImageVector
    get() {
        if (_safeCircle != null) {
            return _safeCircle!!
        }
        _safeCircle = Builder(name = "SafeCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.4697f, 8.4697f)
                curveTo(10.7626f, 8.1768f, 11.2374f, 8.1768f, 11.5303f, 8.4697f)
                lineTo(12.5303f, 9.4697f)
                curveTo(12.5733f, 9.5126f, 12.6099f, 9.5595f, 12.6403f, 9.6091f)
                curveTo(13.0413f, 9.3806f, 13.5054f, 9.25f, 14.0f, 9.25f)
                curveTo(14.4946f, 9.25f, 14.9587f, 9.3806f, 15.3597f, 9.6091f)
                curveTo(15.3901f, 9.5595f, 15.4267f, 9.5126f, 15.4697f, 9.4697f)
                lineTo(16.4697f, 8.4697f)
                curveTo(16.7626f, 8.1768f, 17.2374f, 8.1768f, 17.5303f, 8.4697f)
                curveTo(17.8232f, 8.7626f, 17.8232f, 9.2374f, 17.5303f, 9.5303f)
                lineTo(16.5303f, 10.5303f)
                curveTo(16.4874f, 10.5733f, 16.4405f, 10.6099f, 16.3909f, 10.6403f)
                curveTo(16.6194f, 11.0413f, 16.75f, 11.5054f, 16.75f, 12.0f)
                curveTo(16.75f, 12.4946f, 16.6194f, 12.9587f, 16.3909f, 13.3597f)
                curveTo(16.4405f, 13.3901f, 16.4874f, 13.4267f, 16.5303f, 13.4697f)
                lineTo(17.5303f, 14.4697f)
                curveTo(17.8232f, 14.7626f, 17.8232f, 15.2374f, 17.5303f, 15.5303f)
                curveTo(17.2374f, 15.8232f, 16.7626f, 15.8232f, 16.4697f, 15.5303f)
                lineTo(15.4697f, 14.5303f)
                curveTo(15.4267f, 14.4874f, 15.3901f, 14.4405f, 15.3597f, 14.3909f)
                curveTo(14.9587f, 14.6194f, 14.4946f, 14.75f, 14.0f, 14.75f)
                curveTo(13.5054f, 14.75f, 13.0413f, 14.6194f, 12.6403f, 14.3909f)
                curveTo(12.6099f, 14.4405f, 12.5733f, 14.4874f, 12.5303f, 14.5303f)
                lineTo(11.5303f, 15.5303f)
                curveTo(11.2374f, 15.8232f, 10.7626f, 15.8232f, 10.4697f, 15.5303f)
                curveTo(10.1768f, 15.2374f, 10.1768f, 14.7626f, 10.4697f, 14.4697f)
                lineTo(11.4697f, 13.4697f)
                curveTo(11.5126f, 13.4267f, 11.5595f, 13.3901f, 11.6091f, 13.3597f)
                curveTo(11.3806f, 12.9587f, 11.25f, 12.4946f, 11.25f, 12.0f)
                curveTo(11.25f, 11.5054f, 11.3806f, 11.0413f, 11.6091f, 10.6403f)
                curveTo(11.5595f, 10.6099f, 11.5126f, 10.5733f, 11.4697f, 10.5303f)
                lineTo(10.4697f, 9.5303f)
                curveTo(10.1768f, 9.2374f, 10.1768f, 8.7626f, 10.4697f, 8.4697f)
                close()
                moveTo(12.75f, 12.0f)
                curveTo(12.75f, 11.3096f, 13.3096f, 10.75f, 14.0f, 10.75f)
                curveTo(14.6904f, 10.75f, 15.25f, 11.3096f, 15.25f, 12.0f)
                curveTo(15.25f, 12.6904f, 14.6904f, 13.25f, 14.0f, 13.25f)
                curveTo(13.3096f, 13.25f, 12.75f, 12.6904f, 12.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.25f)
                curveTo(7.4142f, 7.25f, 7.75f, 7.5858f, 7.75f, 8.0f)
                lineTo(7.75f, 16.0f)
                curveTo(7.75f, 16.4142f, 7.4142f, 16.75f, 7.0f, 16.75f)
                curveTo(6.5858f, 16.75f, 6.25f, 16.4142f, 6.25f, 16.0f)
                lineTo(6.25f, 8.0f)
                curveTo(6.25f, 7.5858f, 6.5858f, 7.25f, 7.0f, 7.25f)
                close()
            }
        }
        .build()
        return _safeCircle!!
    }

private var _safeCircle: ImageVector? = null

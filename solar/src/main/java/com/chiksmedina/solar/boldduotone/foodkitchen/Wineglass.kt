package com.chiksmedina.solar.boldduotone.foodkitchen

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
import com.chiksmedina.solar.boldduotone.FoodKitchenGroup

public val FoodKitchenGroup.Wineglass: ImageVector
    get() {
        if (_wineglass != null) {
            return _wineglass!!
        }
        _wineglass = Builder(name = "Wineglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.8947f)
                curveTo(5.0f, 3.8483f, 5.8483f, 3.0f, 6.8947f, 3.0f)
                horizontalLineTo(17.1053f)
                curveTo(18.1517f, 3.0f, 19.0f, 3.8483f, 19.0f, 4.8947f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 11.866f, 15.866f, 15.0f, 12.0f, 15.0f)
                curveTo(8.134f, 15.0f, 5.0f, 11.866f, 5.0f, 8.0f)
                verticalLineTo(4.8947f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.25f, 20.25f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 20.25f, 7.5f, 20.5858f, 7.5f, 21.0f)
                curveTo(7.5f, 21.4142f, 7.8358f, 21.75f, 8.25f, 21.75f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 21.75f, 16.5f, 21.4142f, 16.5f, 21.0f)
                curveTo(16.5f, 20.5858f, 16.1642f, 20.25f, 15.75f, 20.25f)
                horizontalLineTo(12.75f)
                horizontalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 15.0f)
                curveTo(15.5162f, 15.0f, 18.4268f, 12.4075f, 18.9248f, 9.0297f)
                curveTo(18.5226f, 9.1868f, 16.5932f, 9.9156f, 15.2308f, 9.9929f)
                curveTo(13.9033f, 10.0681f, 12.9517f, 9.5341f, 12.0f, 9.0f)
                curveTo(11.0483f, 8.4659f, 10.0967f, 7.9318f, 8.7692f, 8.0071f)
                curveTo(7.3975f, 8.0849f, 5.4509f, 8.8232f, 5.0671f, 8.9734f)
                curveTo(5.5409f, 12.3787f, 8.4643f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 14.9605f)
                curveTo(12.5037f, 14.9867f, 12.2535f, 15.0002f, 12.0002f, 15.0002f)
                curveTo(11.7468f, 15.0002f, 11.4965f, 14.9867f, 11.25f, 14.9604f)
                verticalLineTo(20.2501f)
                horizontalLineTo(12.75f)
                verticalLineTo(14.9605f)
                close()
            }
        }
        .build()
        return _wineglass!!
    }

private var _wineglass: ImageVector? = null

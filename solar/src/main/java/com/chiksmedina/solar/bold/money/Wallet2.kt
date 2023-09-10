package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

val MoneyGroup.Wallet2: ImageVector
    get() {
        if (_wallet2 != null) {
            return _wallet2!!
        }
        _wallet2 = Builder(
            name = "Wallet2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.1009f, 8.0035f)
                curveTo(21.0442f, 8.0f, 20.9825f, 8.0f, 20.9186f, 8.0f)
                lineTo(20.9026f, 8.0f)
                horizontalLineTo(18.3941f)
                curveTo(16.3264f, 8.0f, 14.5572f, 9.6276f, 14.5572f, 11.75f)
                curveTo(14.5572f, 13.8724f, 16.3264f, 15.5f, 18.3941f, 15.5f)
                horizontalLineTo(20.9026f)
                lineTo(20.9186f, 15.5f)
                curveTo(20.9825f, 15.5f, 21.0442f, 15.5001f, 21.1009f, 15.4965f)
                curveTo(21.9408f, 15.4434f, 22.6835f, 14.7862f, 22.746f, 13.8682f)
                curveTo(22.7501f, 13.808f, 22.75f, 13.7431f, 22.75f, 13.683f)
                lineTo(22.75f, 13.6667f)
                verticalLineTo(9.8333f)
                lineTo(22.75f, 9.817f)
                curveTo(22.75f, 9.7569f, 22.7501f, 9.692f, 22.746f, 9.6318f)
                curveTo(22.6835f, 8.7138f, 21.9408f, 8.0566f, 21.1009f, 8.0035f)
                close()
                moveTo(18.1717f, 12.75f)
                curveTo(18.704f, 12.75f, 19.1355f, 12.3023f, 19.1355f, 11.75f)
                curveTo(19.1355f, 11.1977f, 18.704f, 10.75f, 18.1717f, 10.75f)
                curveTo(17.6394f, 10.75f, 17.2078f, 11.1977f, 17.2078f, 11.75f)
                curveTo(17.2078f, 12.3023f, 17.6394f, 12.75f, 18.1717f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.9179f, 17.0f)
                curveTo(21.067f, 16.9961f, 21.1799f, 17.1342f, 21.1394f, 17.2778f)
                curveTo(20.9387f, 17.9902f, 20.62f, 18.5975f, 20.1088f, 19.1088f)
                curveTo(19.3604f, 19.8571f, 18.4114f, 20.1892f, 17.239f, 20.3469f)
                curveTo(16.0998f, 20.5f, 14.6442f, 20.5f, 12.8064f, 20.5f)
                horizontalLineTo(10.6936f)
                curveTo(8.8558f, 20.5f, 7.4002f, 20.5f, 6.261f, 20.3469f)
                curveTo(5.0886f, 20.1892f, 4.1396f, 19.8571f, 3.3912f, 19.1088f)
                curveTo(2.6429f, 18.3604f, 2.3108f, 17.4114f, 2.1531f, 16.239f)
                curveTo(2.0f, 15.0998f, 2.0f, 13.6442f, 2.0f, 11.8064f)
                verticalLineTo(11.6936f)
                curveTo(2.0f, 9.8558f, 2.0f, 8.4002f, 2.1531f, 7.261f)
                curveTo(2.3108f, 6.0886f, 2.6429f, 5.1396f, 3.3912f, 4.3912f)
                curveTo(4.1396f, 3.6429f, 5.0886f, 3.3108f, 6.261f, 3.1531f)
                curveTo(7.4002f, 3.0f, 8.8558f, 3.0f, 10.6936f, 3.0f)
                lineTo(12.8064f, 3.0f)
                curveTo(14.6442f, 3.0f, 16.0998f, 3.0f, 17.239f, 3.1531f)
                curveTo(18.4114f, 3.3108f, 19.3604f, 3.6429f, 20.1088f, 4.3912f)
                curveTo(20.62f, 4.9025f, 20.9386f, 5.5097f, 21.1394f, 6.2222f)
                curveTo(21.1799f, 6.3657f, 21.067f, 6.5039f, 20.9179f, 6.5f)
                lineTo(18.394f, 6.5f)
                curveTo(15.5574f, 6.5f, 13.0571f, 8.7409f, 13.0571f, 11.75f)
                curveTo(13.0571f, 14.7591f, 15.5574f, 17.0f, 18.394f, 17.0f)
                lineTo(20.9179f, 17.0f)
                close()
                moveTo(7.0f, 15.5f)
                curveTo(6.5858f, 15.5f, 6.25f, 15.1642f, 6.25f, 14.75f)
                verticalLineTo(8.75f)
                curveTo(6.25f, 8.3358f, 6.5858f, 8.0f, 7.0f, 8.0f)
                curveTo(7.4142f, 8.0f, 7.75f, 8.3358f, 7.75f, 8.75f)
                verticalLineTo(14.75f)
                curveTo(7.75f, 15.1642f, 7.4142f, 15.5f, 7.0f, 15.5f)
                close()
            }
        }
            .build()
        return _wallet2!!
    }

private var _wallet2: ImageVector? = null

package dev.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.CardSearch: ImageVector
    get() {
        if (_cardSearch != null) {
            return _cardSearch!!
        }
        _cardSearch = Builder(
            name = "CardSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 3.25f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 3.25f, 17.3498f, 3.25f, 18.489f, 3.4031f)
                curveTo(19.6614f, 3.5608f, 20.6104f, 3.8929f, 21.3588f, 4.6412f)
                curveTo(22.1071f, 5.3896f, 22.4392f, 6.3386f, 22.5969f, 7.511f)
                curveTo(22.6873f, 8.1839f, 22.7244f, 8.9671f, 22.7395f, 9.8743f)
                curveTo(22.7464f, 9.9152f, 22.75f, 9.9572f, 22.75f, 10.0f)
                curveTo(22.75f, 10.0353f, 22.7476f, 10.0699f, 22.7429f, 10.1039f)
                curveTo(22.75f, 10.6696f, 22.75f, 11.2818f, 22.75f, 11.9436f)
                verticalLineTo(13.0f)
                curveTo(22.75f, 13.4142f, 22.4142f, 13.75f, 22.0f, 13.75f)
                curveTo(21.5858f, 13.75f, 21.25f, 13.4142f, 21.25f, 13.0f)
                verticalLineTo(12.0f)
                curveTo(21.25f, 11.5541f, 21.2499f, 11.1384f, 21.248f, 10.75f)
                horizontalLineTo(2.752f)
                curveTo(2.7501f, 11.1384f, 2.75f, 11.5541f, 2.75f, 12.0f)
                curveTo(2.75f, 13.9068f, 2.7516f, 15.2615f, 2.8898f, 16.2892f)
                curveTo(3.025f, 17.2952f, 3.2787f, 17.8749f, 3.7019f, 18.2981f)
                curveTo(4.1251f, 18.7213f, 4.7048f, 18.975f, 5.7108f, 19.1102f)
                curveTo(6.7385f, 19.2484f, 8.0932f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 19.25f, 13.75f, 19.5858f, 13.75f, 20.0f)
                curveTo(13.75f, 20.4142f, 13.4142f, 20.75f, 13.0f, 20.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 20.75f, 6.6502f, 20.75f, 5.511f, 20.5969f)
                curveTo(4.3386f, 20.4392f, 3.3896f, 20.1071f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6104f, 1.5608f, 17.6614f, 1.4031f, 16.489f)
                curveTo(1.25f, 15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 11.2818f, 1.25f, 10.6696f, 1.2571f, 10.1039f)
                curveTo(1.2524f, 10.0699f, 1.25f, 10.0352f, 1.25f, 10.0f)
                curveTo(1.25f, 9.9572f, 1.2536f, 9.9152f, 1.2605f, 9.8743f)
                curveTo(1.2756f, 8.9671f, 1.3127f, 8.1839f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f, 3.25f)
                close()
                moveTo(2.7761f, 9.25f)
                horizontalLineTo(21.2239f)
                curveTo(21.2044f, 8.6633f, 21.1701f, 8.1563f, 21.1102f, 7.7108f)
                curveTo(20.975f, 6.7048f, 20.7213f, 6.1251f, 20.2981f, 5.7019f)
                curveTo(19.8749f, 5.2787f, 19.2952f, 5.025f, 18.2892f, 4.8898f)
                curveTo(17.2615f, 4.7516f, 15.9068f, 4.75f, 14.0f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 4.75f, 6.7385f, 4.7516f, 5.7108f, 4.8898f)
                curveTo(4.7048f, 5.025f, 4.1251f, 5.2787f, 3.7019f, 5.7019f)
                curveTo(3.2787f, 6.1251f, 3.025f, 6.7048f, 2.8898f, 7.7108f)
                curveTo(2.8299f, 8.1563f, 2.7956f, 8.6633f, 2.7761f, 9.25f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.7574f, 14.75f, 15.75f, 15.7574f, 15.75f, 17.0f)
                curveTo(15.75f, 18.2426f, 16.7574f, 19.25f, 18.0f, 19.25f)
                curveTo(19.2426f, 19.25f, 20.25f, 18.2426f, 20.25f, 17.0f)
                curveTo(20.25f, 15.7574f, 19.2426f, 14.75f, 18.0f, 14.75f)
                close()
                moveTo(14.25f, 17.0f)
                curveTo(14.25f, 14.9289f, 15.9289f, 13.25f, 18.0f, 13.25f)
                curveTo(20.0711f, 13.25f, 21.75f, 14.9289f, 21.75f, 17.0f)
                curveTo(21.75f, 17.7643f, 21.5213f, 18.4752f, 21.1287f, 19.068f)
                lineTo(22.0303f, 19.9697f)
                curveTo(22.3232f, 20.2626f, 22.3232f, 20.7374f, 22.0303f, 21.0303f)
                curveTo(21.7374f, 21.3232f, 21.2626f, 21.3232f, 20.9697f, 21.0303f)
                lineTo(20.068f, 20.1287f)
                curveTo(19.4752f, 20.5213f, 18.7643f, 20.75f, 18.0f, 20.75f)
                curveTo(15.9289f, 20.75f, 14.25f, 19.0711f, 14.25f, 17.0f)
                close()
                moveTo(5.25f, 16.0f)
                curveTo(5.25f, 15.5858f, 5.5858f, 15.25f, 6.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 16.75f, 5.25f, 16.4142f, 5.25f, 16.0f)
                close()
            }
        }
            .build()
        return _cardSearch!!
    }

private var _cardSearch: ImageVector? = null

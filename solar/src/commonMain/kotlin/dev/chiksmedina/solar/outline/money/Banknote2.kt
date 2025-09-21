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

val MoneyGroup.Banknote2: ImageVector
    get() {
        if (_banknote2 != null) {
            return _banknote2!!
        }
        _banknote2 = Builder(
            name = "Banknote2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.9451f, 4.25f)
                horizontalLineTo(13.0549f)
                curveTo(14.4225f, 4.25f, 15.5248f, 4.25f, 16.3918f, 4.3665f)
                curveTo(17.2919f, 4.4875f, 18.0497f, 4.7464f, 18.6517f, 5.3484f)
                curveTo(19.2061f, 5.9028f, 19.4695f, 6.5895f, 19.6022f, 7.3978f)
                curveTo(20.4106f, 7.5305f, 21.0974f, 7.7939f, 21.6519f, 8.3484f)
                curveTo(22.2538f, 8.9503f, 22.5127f, 9.7082f, 22.6337f, 10.6083f)
                curveTo(22.7503f, 11.4753f, 22.7503f, 12.5776f, 22.7503f, 13.9452f)
                verticalLineTo(14.0549f)
                curveTo(22.7503f, 15.4225f, 22.7503f, 16.5248f, 22.6337f, 17.3918f)
                curveTo(22.5127f, 18.2919f, 22.2538f, 19.0498f, 21.6519f, 19.6517f)
                curveTo(21.05f, 20.2536f, 20.2921f, 20.5125f, 19.392f, 20.6335f)
                curveTo(18.525f, 20.7501f, 17.4227f, 20.7501f, 16.0551f, 20.7501f)
                horizontalLineTo(10.9454f)
                curveTo(9.5778f, 20.7501f, 8.4755f, 20.7501f, 7.6085f, 20.6335f)
                curveTo(6.7084f, 20.5125f, 5.9505f, 20.2536f, 5.3486f, 19.6517f)
                curveTo(4.7942f, 19.0973f, 4.5307f, 18.4105f, 4.3981f, 17.6022f)
                curveTo(3.5896f, 17.4695f, 2.9028f, 17.2061f, 2.3484f, 16.6517f)
                curveTo(1.7464f, 16.0497f, 1.4875f, 15.2919f, 1.3665f, 14.3918f)
                curveTo(1.25f, 13.5248f, 1.25f, 12.4225f, 1.25f, 11.0549f)
                verticalLineTo(10.9451f)
                curveTo(1.25f, 9.5775f, 1.25f, 8.4752f, 1.3665f, 7.6083f)
                curveTo(1.4875f, 6.7081f, 1.7464f, 5.9503f, 2.3484f, 5.3484f)
                curveTo(2.9503f, 4.7464f, 3.7081f, 4.4875f, 4.6083f, 4.3665f)
                curveTo(5.4752f, 4.25f, 6.5775f, 4.25f, 7.9451f, 4.25f)
                close()
                moveTo(5.9557f, 17.7316f)
                curveTo(6.0606f, 18.1345f, 6.21f, 18.3918f, 6.4093f, 18.591f)
                curveTo(6.686f, 18.8678f, 7.0746f, 19.0483f, 7.8084f, 19.1469f)
                curveTo(8.5637f, 19.2485f, 9.5648f, 19.2501f, 11.0003f, 19.2501f)
                horizontalLineTo(16.0003f)
                curveTo(17.4357f, 19.2501f, 18.4368f, 19.2485f, 19.1921f, 19.1469f)
                curveTo(19.9259f, 19.0483f, 20.3145f, 18.8678f, 20.5912f, 18.591f)
                curveTo(20.868f, 18.3143f, 21.0485f, 17.9257f, 21.1471f, 17.1919f)
                curveTo(21.2487f, 16.4366f, 21.2503f, 15.4355f, 21.2503f, 14.0001f)
                curveTo(21.2503f, 12.5646f, 21.2487f, 11.5635f, 21.1471f, 10.8082f)
                curveTo(21.0485f, 10.0744f, 20.868f, 9.6858f, 20.5912f, 9.4091f)
                curveTo(20.3919f, 9.2098f, 20.1346f, 9.0603f, 19.7316f, 8.9555f)
                curveTo(19.75f, 9.5443f, 19.75f, 10.206f, 19.75f, 10.9451f)
                verticalLineTo(11.0549f)
                curveTo(19.75f, 12.4225f, 19.75f, 13.5248f, 19.6335f, 14.3918f)
                curveTo(19.5125f, 15.2919f, 19.2536f, 16.0497f, 18.6517f, 16.6517f)
                curveTo(18.0497f, 17.2536f, 17.2919f, 17.5125f, 16.3918f, 17.6335f)
                curveTo(15.5248f, 17.75f, 14.4225f, 17.75f, 13.0549f, 17.75f)
                horizontalLineTo(7.9451f)
                curveTo(7.2061f, 17.75f, 6.5445f, 17.75f, 5.9557f, 17.7316f)
                close()
                moveTo(4.8081f, 5.8531f)
                curveTo(4.0743f, 5.9518f, 3.6858f, 6.1322f, 3.409f, 6.409f)
                curveTo(3.1323f, 6.6858f, 2.9518f, 7.0743f, 2.8531f, 7.8081f)
                curveTo(2.7516f, 8.5635f, 2.75f, 9.5646f, 2.75f, 11.0f)
                curveTo(2.75f, 12.4354f, 2.7516f, 13.4365f, 2.8531f, 14.1919f)
                curveTo(2.9518f, 14.9257f, 3.1323f, 15.3142f, 3.409f, 15.591f)
                curveTo(3.6858f, 15.8678f, 4.0743f, 16.0482f, 4.8081f, 16.1469f)
                curveTo(5.5635f, 16.2484f, 6.5646f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(13.0f)
                curveTo(14.4354f, 16.25f, 15.4365f, 16.2484f, 16.1919f, 16.1469f)
                curveTo(16.9257f, 16.0482f, 17.3142f, 15.8678f, 17.591f, 15.591f)
                curveTo(17.8678f, 15.3142f, 18.0482f, 14.9257f, 18.1469f, 14.1919f)
                curveTo(18.2484f, 13.4365f, 18.25f, 12.4354f, 18.25f, 11.0f)
                curveTo(18.25f, 9.5646f, 18.2484f, 8.5635f, 18.1469f, 7.8081f)
                curveTo(18.0482f, 7.0743f, 17.8678f, 6.6858f, 17.591f, 6.409f)
                curveTo(17.3142f, 6.1322f, 16.9257f, 5.9518f, 16.1919f, 5.8531f)
                curveTo(15.4365f, 5.7516f, 14.4354f, 5.75f, 13.0f, 5.75f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 5.75f, 5.5635f, 5.7516f, 4.8081f, 5.8531f)
                close()
                moveTo(10.5f, 9.25f)
                curveTo(9.5335f, 9.25f, 8.75f, 10.0335f, 8.75f, 11.0f)
                curveTo(8.75f, 11.9665f, 9.5335f, 12.75f, 10.5f, 12.75f)
                curveTo(11.4665f, 12.75f, 12.25f, 11.9665f, 12.25f, 11.0f)
                curveTo(12.25f, 10.0335f, 11.4665f, 9.25f, 10.5f, 9.25f)
                close()
                moveTo(7.25f, 11.0f)
                curveTo(7.25f, 9.2051f, 8.7051f, 7.75f, 10.5f, 7.75f)
                curveTo(12.2949f, 7.75f, 13.75f, 9.2051f, 13.75f, 11.0f)
                curveTo(13.75f, 12.7949f, 12.2949f, 14.25f, 10.5f, 14.25f)
                curveTo(8.7051f, 14.25f, 7.25f, 12.7949f, 7.25f, 11.0f)
                close()
                moveTo(5.0f, 8.25f)
                curveTo(5.4142f, 8.25f, 5.75f, 8.5858f, 5.75f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(5.75f, 13.4142f, 5.4142f, 13.75f, 5.0f, 13.75f)
                curveTo(4.5858f, 13.75f, 4.25f, 13.4142f, 4.25f, 13.0f)
                lineTo(4.25f, 9.0f)
                curveTo(4.25f, 8.5858f, 4.5858f, 8.25f, 5.0f, 8.25f)
                close()
                moveTo(16.0f, 8.25f)
                curveTo(16.4142f, 8.25f, 16.75f, 8.5858f, 16.75f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(16.75f, 13.4142f, 16.4142f, 13.75f, 16.0f, 13.75f)
                curveTo(15.5858f, 13.75f, 15.25f, 13.4142f, 15.25f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(15.25f, 8.5858f, 15.5858f, 8.25f, 16.0f, 8.25f)
                close()
            }
        }
            .build()
        return _banknote2!!
    }

private var _banknote2: ImageVector? = null
